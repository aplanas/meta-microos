SUMMARY = "Generate and parse RFC 3339 timestamps"
DESCRIPTION = "pyRFC3339 parses and generates :RFC:`3339`-compliant timestamps using Python `datetime.datetime` objects."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python311-pyRFC3339-1.1-4.3.noarch.rpm"
RPM_HASH = "71b92b081d4deeaf4c6fa22220bef56e616b16ea6401fd6ec143e787906b02f8c9f3c4a2ecc4abb7e027184c2d91d6a41609906534a3d9c3333295edc22698fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyRFC3339 \
python3.11dist-pyrfc3339 \
python311-pyRFC3339 \
python3dist-pyrfc3339"

RDEPENDS:${PN} += "python-abi \
python311-pytz"

inherit rpm
