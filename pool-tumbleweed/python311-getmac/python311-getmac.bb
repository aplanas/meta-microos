SUMMARY = "Module to get MAC addresses of remote hosts and local interfaces"
DESCRIPTION = "A Python module to get MAC addresses of remote hosts and local interfaces."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "python311-getmac-0.8.3-1.6.noarch.rpm"
RPM_HASH = "8f90fe05fdff991cc247f93c93329f5f93a57361f0f369ca1d7f3c7aa726b3bd82da6de0c70055d7444f32ecb181937295e2fd6e6847781f1f6585e3aa3a0dcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-getmac \
python3.11dist-getmac \
python311-getmac \
python3dist-getmac"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
