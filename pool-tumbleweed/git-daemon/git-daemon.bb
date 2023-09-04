SUMMARY = "Simple Server for Git Repositories"
DESCRIPTION = "A really simple TCP git daemon. In the default configuration it allows \
read only access to repositories in /srv/git/ that contain the \
'git-daemon-export-ok' file."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-daemon-2.41.0-1.3.aarch64.rpm"
RPM_HASH = "629b2141ef828f5fb62aa5ee3745506c3e29dc1c06dbf31838f6f55e9fb0066d6a975197bfdfdce5f094165132144dac1b3ab3e39260bc8c039b242fbd65de41"

RPROVIDES:${PN} += "git-daemon \
group-git-daemon \
user-git-daemon"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
bash \
fillup \
git-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0 \
libsha1detectcoll.so.1 \
libz.so.1 \
systemd \
sysuser-shadow"

inherit rpm
