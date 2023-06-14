SUMMARY = "Generate and parse RFC 3339 timestamps"
DESCRIPTION = "pyRFC3339 parses and generates :RFC:`3339`-compliant timestamps using Python `datetime.datetime` objects."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python310-pyRFC3339-1.1-3.8.noarch.rpm"
RPM_HASH = "a8127005192513242825b305e3805b3234e3de183650f9773d5dcf4a1529a1d40f5a52031d51de407cf40b60c3d6ef1f7638df33d137f1673077b8854492708a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyRFC3339 \
python3.10dist-pyrfc3339 \
python310-pyRFC3339 \
python3dist-pyrfc3339"

RDEPENDS:${PN} += "python-abi \
python310-pytz"

inherit rpm
