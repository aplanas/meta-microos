SUMMARY = "Python wrapper for the Kismet REST interface"
DESCRIPTION = "Simplified Python API for the Kismet REST interface."
LICENSE = "GPL-2.0"

PV = "2019.05.02"

RPM_NAME = "python311-kismet-rest-2019.05.02-1.14.noarch.rpm"
RPM_HASH = "5fce42491a39c8f3b24023ff99350c07eef97989db27193ed391768349aacc0ecabf81e026bc14f4f48437bde5c695524e1623ee459252f943bc047051db93e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(kismet-rest) \
python311-kismet-rest \
python3dist(kismet-rest)"

RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm
