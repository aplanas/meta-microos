SUMMARY = "An OSP server implementation"
DESCRIPTION = "An OSP server implementation to allow GVM to remotely control OpenVAS."
LICENSE = "AGPL-3.0-or-later"

PV = "22.4.5"

RPM_NAME = "python311-ospd-openvas-22.4.5-1.7.noarch.rpm"
RPM_HASH = "3594ee81675532ce29973760a8fee913ae32a5f5bb0c1927aa88efd5202925ffd36f644510efa42e03ea2971458b04d207ef1e46debd70a0273024d75e08e62d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ospd-openvas \
python3-ospd \
python3-ospd-openvas \
python3.11dist-ospd-openvas \
python311-ospd \
python311-ospd-openvas \
python3dist-ospd-openvas"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-defusedxml \
python311-gnupg \
python311-lxml \
python311-packaging \
python311-paho-mqtt \
python311-psutil \
python311-redis"

inherit rpm
