SUMMARY = "An OSP server implementation"
DESCRIPTION = "An OSP server implementation to allow GVM to remotely control OpenVAS."
LICENSE = "AGPL-3.0-or-later"

PV = "22.4.5"

RPM_NAME = "python39-ospd-openvas-22.4.5-1.7.noarch.rpm"
RPM_HASH = "200cec95c87be0ff6cde6207f2152f5e2afc4b9e456be5793d88b77e7a33d9c791644a2c7c3514bd0ad1dcd45e23d2e2aa1ce6f00ebb41f393649640343b7ae0"
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
