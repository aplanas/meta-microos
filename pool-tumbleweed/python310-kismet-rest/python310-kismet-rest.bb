SUMMARY = "Python wrapper for the Kismet REST interface"
DESCRIPTION = "Simplified Python API for the Kismet REST interface."
LICENSE = "GPL-2.0"

PV = "2019.05.02"

RPM_NAME = "python310-kismet-rest-2019.05.02-2.1.noarch.rpm"
RPM_HASH = "aa418152b2ec079a4efe74f3bc20a4924bba28d0537cc7f2b547405b085d4611ecd0311d9b29f6e084bb128fbb3477d4646949a1d8fc005cfbcc9cc463a9347b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-kismet-rest \
python310-kismet-rest \
python3dist-kismet-rest"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
