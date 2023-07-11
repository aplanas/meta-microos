SUMMARY = "Typography related template filters for Django & Jinja2 applications"
DESCRIPTION = "This application provides a set of custom filters for the Django template system \
which automatically apply various transformations to plain text in order to yield \
typographically-improved HTML."
LICENSE = "BSD-3-Clause"

PV = "2.0.7"

RPM_NAME = "python311-typogrify-2.0.7-2.1.noarch.rpm"
RPM_HASH = "1492565cefb4e7d3a77d5546d1e9164a793e04bbfd781599cec939362cde2ccd0d46784fd73df7a19c162a681aea38d8b1d15103242242fdabec09b31cd1040f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typogrify \
python3.11dist-typogrify \
python311-typogrify \
python3dist-typogrify"

RDEPENDS:${PN} += "python-abi \
python311-smartypants"

inherit rpm
