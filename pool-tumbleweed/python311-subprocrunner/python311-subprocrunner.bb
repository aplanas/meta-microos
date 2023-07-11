SUMMARY = "A Python wrapper library for subprocess module"
DESCRIPTION = "A Python wrapper library for subprocess module."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-subprocrunner-2.0.0-2.5.noarch.rpm"
RPM_HASH = "b1956dda2a1646935f22440eb43f8a674ad0194c4af00b80cea89d0c81f415f80fedeea5f294637ad961bd347bb10f9dff21559f47dc131239add685d991aaba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subprocrunner \
python3.11dist-subprocrunner \
python311-subprocrunner \
python3dist-subprocrunner"

RDEPENDS:${PN} += "python-abi \
python311-loguru \
python311-mbstrdecoder \
python311-typepy"

inherit rpm
