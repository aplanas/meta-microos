SUMMARY = "Generate and parse RFC 3339 timestamps"
DESCRIPTION = "pyRFC3339 parses and generates :RFC:`3339`-compliant timestamps using Python `datetime.datetime` objects."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python39-pyRFC3339-1.1-4.3.noarch.rpm"
RPM_HASH = "b7b6c9e786100a1f0e06b8b2e90534ed84de7c225fc38b6ee0bd68af2d41c4cd16642f4b63a41b9a0e6ebb208c84c0ad58552f5abdb34b3a7c6ae71c0aa0e8a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyrfc3339 \
python39-pyRFC3339 \
python3dist-pyrfc3339"

RDEPENDS:${PN} += "python-abi \
python39-pytz"

inherit rpm
