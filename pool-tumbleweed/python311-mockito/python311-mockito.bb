SUMMARY = "Spying framework"
DESCRIPTION = "Mockito is a spying framework originally based on the Java library with the same name."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python311-mockito-1.4.0-1.3.noarch.rpm"
RPM_HASH = "1696006513ad9548416dea68fe5a47710dd9776fcc01b6344c1f0249daf274484bd56b86981a06331553461b0457c517c64ef044a998e3a8b859a0488820ac2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mockito) \
python311-mockito \
python3dist(mockito)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
