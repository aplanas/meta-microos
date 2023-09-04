SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "This is the openSUSE MicroOS runtime system. It contains only a minimal multiuser \
booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-5.0-73.1.aarch64.rpm"
RPM_HASH = "c76e864dc8e14982fb52107a3a4db5b12909863405e9f467419e2678d264b165fdae0670a56f058a9ded7d47bbfef4f4b81e060cb7184f1903ad3a02c467a6d4"

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
