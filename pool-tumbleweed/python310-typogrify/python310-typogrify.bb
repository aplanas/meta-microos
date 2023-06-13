SUMMARY = "Typography related template filters for Django & Jinja2 applications"
DESCRIPTION = "This application provides a set of custom filters for the Django template system \
which automatically apply various transformations to plain text in order to yield \
typographically-improved HTML."
LICENSE = "BSD-3-Clause"

PV = "2.0.7"

RPM_NAME = "python310-typogrify-2.0.7-1.11.noarch.rpm"
RPM_HASH = "c0045b0e1ce800f610fc9acdea5a9895d524ed49936541fc8d4522489d72405411390e1faddee7a2c09b58bdc2e24279ca614920f48c302bb8937fbe1a516c68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typogrify \
python3.10dist(typogrify) \
python310-typogrify \
python3dist(typogrify)"

RDEPENDS:${PN} += "python(abi) \
python310-smartypants"

inherit rpm
