SUMMARY = "Generate and parse RFC 3339 timestamps"
DESCRIPTION = "pyRFC3339 parses and generates :RFC:`3339`-compliant timestamps using Python `datetime.datetime` objects."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python310-pyRFC3339-1.1-4.3.noarch.rpm"
RPM_HASH = "6268b904f75bee12bd7afc4cb902a885332dcc439ac75b51852cd8656033c1bad2864abf8c34aa02f69db1c3bbed44a9da9fdf5c15e9a02f98fee9b9ec6b8c8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyrfc3339 \
python310-pyRFC3339 \
python3dist-pyrfc3339"

RDEPENDS:${PN} += "python-abi \
python310-pytz"

inherit rpm
