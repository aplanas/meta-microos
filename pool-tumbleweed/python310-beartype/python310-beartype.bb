SUMMARY = "Unbearably fast runtime type checking in pure Python"
DESCRIPTION = "Unbearably fast runtime type checking in pure Python."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python310-beartype-0.15.0-1.1.noarch.rpm"
RPM_HASH = "15695fa0567b9bf1c50658c44cda776b81d27d608ea6990883aa4e08042e7abee32fb6d49ff7f02db9250f47f34c1baa6f9ac60119a463c2dd1f35b348b2d67a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-beartype \
python310-beartype \
python3dist-beartype"

RDEPENDS:${PN} += "python-abi"

inherit rpm
