SUMMARY = "An OSP server implementation"
DESCRIPTION = "An OSP server implementation to allow GVM to remotely control OpenVAS."
LICENSE = "AGPL-3.0-or-later"

PV = "22.4.5"

RPM_NAME = "python39-ospd-openvas-22.4.5-1.5.noarch.rpm"
RPM_HASH = "0703de2d01d8648d53d41b8bfee1c4ac28f0f117f3b3b13bb99a38bb5f3982774c0264773973c36ec8d5947d95f24aa7e6981b5d4e0b5e0168fdfcf489cc14af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ospd-openvas \
python3.9dist-ospd-openvas \
python39-ospd \
python39-ospd-openvas \
python3dist-ospd-openvas"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-defusedxml \
python39-gnupg \
python39-lxml \
python39-packaging \
python39-paho-mqtt \
python39-psutil \
python39-redis"

inherit rpm
