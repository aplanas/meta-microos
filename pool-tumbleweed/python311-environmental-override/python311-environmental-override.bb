SUMMARY = "Module to configure apps using environment variables"
DESCRIPTION = "Environmental Override offers setting configuration values from \
environment variables."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-environmental-override-0.1.2-1.18.noarch.rpm"
RPM_HASH = "84444591d475592d49042050de1d2d34fb5b43612f7e80ae549da482cc9ec240264eff81d74a8bf144889ad816e703f0340cda5177a9564f15272e74f71f5fbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-environmental-override \
python3.11dist-environmental-override \
python311-environmental-override \
python3dist-environmental-override"

RDEPENDS:${PN} += "python-abi"

inherit rpm
