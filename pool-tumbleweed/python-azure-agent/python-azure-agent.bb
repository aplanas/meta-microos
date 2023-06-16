SUMMARY = "Microsoft Azure Linux Agent"
DESCRIPTION = "The azure-agent supports the provisioning and running of Linux \
VMs in the Microsoft Azure Public Cloud and Microsoft Azure Stack private \
cloud. This package should be installed on Linux disk \
images that are built to run withing the Microsoft Azure or \
Microsoft Azure Stack framework."
LICENSE = "Apache-2.0"

PV = "2.8.0.11"

RPM_NAME = "python-azure-agent-2.8.0.11-3.3.noarch.rpm"
RPM_HASH = "223b78118e2c6561c403beccafa8c7be326fb654b0825b72bb26d29e13b10d6ef52524f65fdeb73730020729baf5ad683ba13b904096c4f8a0a8f0a0e14797fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WALinuxAgent \
config-python-azure-agent \
python-azure-agent \
python3.10dist-walinuxagent \
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
