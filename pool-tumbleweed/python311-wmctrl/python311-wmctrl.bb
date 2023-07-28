SUMMARY = "Python programmatic control of X windows"
DESCRIPTION = "Python tool to programmatically control windows inside X."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python311-wmctrl-0.4-2.5.noarch.rpm"
RPM_HASH = "a04bcc84784e93c7c3a7b9a62485b5a3d272f556dbd98ebdbb96a1e53dc4d43c0e2b0cbbc89bee022d35073e66a3959b8ffd229726cf3a6b888675116db5ca89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wmctrl \
python3.11dist-wmctrl \
python311-wmctrl \
python3dist-wmctrl"

RDEPENDS:${PN} += "python-abi \
wmctrl \
xorg-x11-server"

inherit rpm
