SUMMARY = "Module that selects the fastest JSON functions available at import time"
DESCRIPTION = "A Python module that selects the fastest JSON functions available at \
import time."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python311-mujson-1.4-2.15.noarch.rpm"
RPM_HASH = "02615f42e09d7d629dc8c6a7d1772b47dd0753a417aa215be61114a890716c04db25be46a52368a477804972d75cdb47dfe79e13ea7db74d0a62611df649c0d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mujson \
python311-mujson \
python3dist-mujson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
