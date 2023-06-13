SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "This is the openSUSE MicroOS runtime system. It contains only a minimal multiuser \
booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-base-5.0-70.1.aarch64.rpm"
RPM_HASH = "69b6dc3944cefb7a16cba80ce1ec3c302a8098339c1b3ecff887d7d69e07afb0dc236fc44887223b561fdd683e127c8bb62bb79bd5456ab3f3e83f34175f3bbd"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-microos-base \
patterns-microos-base(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/gzip \
/usr/bin/hostname \
MicroOS-release \
NetworkManager \
NetworkManager-wifi \
aaa_base \
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
group(nobody) \
health-checker \
health-checker-plugins-MicroOS \
iproute2 \
iputils \
issue-generator \
kdump \
lastlog2 \
less \
libnss_usrfiles2 \
microos-tools \
openSUSE-build-key \
openssh \
pam \
pam-config \
pattern() \
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
user(nobody) \
util-linux \
vim-small \
wtmpdb \
yast2-logs"

inherit rpm
