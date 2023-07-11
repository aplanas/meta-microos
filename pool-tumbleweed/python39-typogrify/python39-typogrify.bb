SUMMARY = "Typography related template filters for Django & Jinja2 applications"
DESCRIPTION = "This application provides a set of custom filters for the Django template system \
which automatically apply various transformations to plain text in order to yield \
typographically-improved HTML."
LICENSE = "BSD-3-Clause"

PV = "2.0.7"

RPM_NAME = "python39-typogrify-2.0.7-2.1.noarch.rpm"
RPM_HASH = "26808c6c2bdb22d2f126c6e0e49d297e6b95e9f6b0494202405c3e6fa3a2ab4531aa30fc419edfb96f33b8253644de7fbe40242db64b97172f55dffa23fd0e40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-typogrify \
python39-typogrify \
python3dist-typogrify"

RDEPENDS:${PN} += "python-abi \
python39-smartypants"

inherit rpm
