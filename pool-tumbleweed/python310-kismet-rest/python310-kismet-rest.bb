SUMMARY = "Python wrapper for the Kismet REST interface"
DESCRIPTION = "Simplified Python API for the Kismet REST interface."
LICENSE = "GPL-2.0"

PV = "2019.05.02"

RPM_NAME = "python310-kismet-rest-2019.05.02-1.15.noarch.rpm"
RPM_HASH = "e9f74392533a79188f0ddd30f02a0d5b3a059527ab4f172be080d4ce78e07ffb6296b0d516fa4dc61b1bcee2d58c2c0c69ccaa8804fd13fa5b8b4d093c20d688"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-kismet-rest \
python310-kismet-rest \
python3dist-kismet-rest"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
