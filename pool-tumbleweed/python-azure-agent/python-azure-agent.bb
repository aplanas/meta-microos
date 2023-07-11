SUMMARY = "Microsoft Azure Linux Agent"
DESCRIPTION = "The azure-agent supports the provisioning and running of Linux \
VMs in the Microsoft Azure Public Cloud and Microsoft Azure Stack private \
cloud. This package should be installed on Linux disk \
images that are built to run withing the Microsoft Azure or \
Microsoft Azure Stack framework."
LICENSE = "Apache-2.0"

PV = "2.8.0.11"

RPM_NAME = "python-azure-agent-2.8.0.11-3.5.noarch.rpm"
RPM_HASH = "d04418faedee6c044094bb9b0bc3e82842c8d9567619b8f03e7f5776615face779fe2cfff3b9933bddd8ae1acc3a83298c5c0575a728fccff69e8593fa37ecf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WALinuxAgent \
config-python-azure-agent \
python-azure-agent \
python3.11dist-walinuxagent \
python3dist-walinuxagent"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
eject \
grep \
iptables \
logrotate \
openssh \
openssl \
pwdutils \
python-abi \
python3-distro \
python3-pyasn1 \
python3-xml \
sudo \
systemd \
sysvinit-tools \
util-linux \
wicked"

inherit rpm
