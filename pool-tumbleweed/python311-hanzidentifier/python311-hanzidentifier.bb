SUMMARY = "Python module that identifies Chinese text as Simplified or Traditional"
DESCRIPTION = "Python module that identifies Chinese text as Simplified or Traditional."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-hanzidentifier-1.1.0-2.1.noarch.rpm"
RPM_HASH = "ed869e47a0875742610c6fb82e92208995fc3da345a0d8cc35d1f54b1cc80f15a570e70ddc825f0857e8291feee084d2b5a70efad9c91a2e8bedb4fe6f0ed8b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hanzidentifier) \
python311-hanzidentifier \
python3dist(hanzidentifier)"
RDEPENDS:${PN} += "python(abi) \
python311-zhon"

inherit rpm
