SUMMARY = "An OSP server implementation"
DESCRIPTION = "An OSP server implementation to allow GVM to remotely control OpenVAS."
LICENSE = "AGPL-3.0-or-later"

PV = "22.4.5"

RPM_NAME = "python310-ospd-openvas-22.4.5-1.5.noarch.rpm"
RPM_HASH = "6e7c5da3785d26cbb7a9c9a8c67833b0baeec8bd4872ffbd42daaae870f31a5f45c0ecf050251610c6d2876962b6ebb3c5e0c46524adabcc1bcad5ee072e9fb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ospd-openvas \
python3-ospd \
python3-ospd-openvas \
python3.10dist-ospd-openvas \
python310-ospd \
python310-ospd-openvas \
python3dist-ospd-openvas"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-defusedxml \
python310-gnupg \
python310-lxml \
python310-packaging \
python310-paho-mqtt \
python310-psutil \
python310-redis"

inherit rpm
