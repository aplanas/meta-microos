SUMMARY = "Module that selects the fastest JSON functions available at import time"
DESCRIPTION = "A Python module that selects the fastest JSON functions available at \
import time."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python310-mujson-1.4-2.16.noarch.rpm"
RPM_HASH = "5b501b48fbb1ad0fb755bbb89b0f2c3a07644f6c6e2c6c64c22bfd2aeb2c76cb0255d4aa8a9b6aa19680afc905e29991a40304d0bec2f4381f2c3b874d9c70e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mujson \
python310-mujson \
python3dist-mujson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
