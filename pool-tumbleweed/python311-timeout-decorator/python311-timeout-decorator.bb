SUMMARY = "Python timeout decorator"
DESCRIPTION = "Python timeout decorator."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python311-timeout-decorator-0.5.0-1.3.noarch.rpm"
RPM_HASH = "d73dbe50b362b43cb9503135807e43007d07ed83dd809a393342366df5b69945790469249d73bb8216b0860e752ae6e00360538bd82835509eecf2d90f15aa8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-timeout-decorator \
python3.11dist-timeout-decorator \
python311-timeout-decorator \
python3dist-timeout-decorator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
