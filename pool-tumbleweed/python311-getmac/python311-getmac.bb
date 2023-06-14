SUMMARY = "Module to get MAC addresses of remote hosts and local interfaces"
DESCRIPTION = "A Python module to get MAC addresses of remote hosts and local interfaces."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "python311-getmac-0.8.3-1.4.noarch.rpm"
RPM_HASH = "a528a2f9cd6e2b7906e9841a78ea3f11cdfa21c63c752266ff9739a0188f54743d17f5705d73c9020b8e07519970a72a65836c7c449a43b0d129a68b0884ba5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-getmac \
python311-getmac \
python3dist-getmac"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
update-alternatives"

inherit rpm
