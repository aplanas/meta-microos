SUMMARY = "Python module to check syntax of reStructuredText"
DESCRIPTION = "A Python module to check the syntax of reStructuredText and code \
blocks nested within it."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python310-rstcheck-3.3.1-5.13.noarch.rpm"
RPM_HASH = "d2bf3424c0d18484ee96ec5d00a3f5fb17adc3c84fb365246e47f76cc91c07b7868a917a0f8a4e95b0d8f01df8b4936843a94f4e09680c18274a58aed93e6b71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rstcheck \
python310-rstcheck \
python3dist-rstcheck \
rstcheck"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-docutils \
update-alternatives"

inherit rpm
