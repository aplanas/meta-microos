SUMMARY = "Man in the middle proxy for honeypot as a service"
DESCRIPTION = "HaaS proxy application forwards incoming traffic from port 22 (commonly used \
for SSH) to the HaaS server, where Cowrie honeypot simulates a device and \
records executed commands."
LICENSE = "GPL-2.0-only"

PV = "1.9"

RPM_NAME = "haas-proxy-1.9-1.14.noarch.rpm"
RPM_HASH = "a402789584022889b113108a5a0be45380569daf42622206069fabfa9117fec95f50146912f4137b740f2616b179fa10fba605b1340b9536fd33d41c8758e108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-haas-proxy \
haas-proxy \
python3.11dist-haas-proxy \
python3dist-haas-proxy"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
python3-Twisted \
python3-base \
python3-cachetools \
python3-pycrypto \
python3-service-identity \
sshpass \
systemd"

inherit rpm
