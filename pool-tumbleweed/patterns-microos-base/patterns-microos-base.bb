SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "This is the openSUSE MicroOS runtime system. It contains only a minimal multiuser \
booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-5.0-72.1.aarch64.rpm"
RPM_HASH = "45da2364737d373f05c8eb12630fa52897a472908c15d5320213d807bc5e67e233332e9334a2f5fe2a0d59c87cd9069b91d67f926a702d3383bf47228ff88bb2"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-base"

RDEPENDS:${PN} += "/usr/bin/gzip \
/usr/bin/hostname \
MicroOS-release \
NetworkManager \
NetworkManager-wifi \
aaa-base \
bash \
branding-openSUSE \
btrfsmaintenance \
btrfsprogs \
busybox \
ca-certificates \
ca-certificates-mozilla \
chrony \
coreutils \
curl \
dosfstools \
glibc \
glibc-locale-base \
group-nobody \
health-checker \
health-checker-plugins-MicroOS \
iproute2 \
iputils \
issue-generator \
kdump \
lastlog2 \
less \
libnss-usrfiles2 \
microos-tools \
openSUSE-build-key \
openssh \
pam \
pam-config \
pattern- \
procps \
rebootmgr \
rpm \
shadow \
snapper \
sudo \
systemd \
systemd-presets-branding-MicroOS \
terminfo-base \
timezone \
user-nobody \
util-linux \
vim-small \
wtmpdb \
yast2-logs"

inherit rpm
