SUMMARY = "Simple Server for Git Repositories"
DESCRIPTION = "A really simple TCP git daemon. In the default configuration it allows \
read only access to repositories in /srv/git/ that contain the \
'git-daemon-export-ok' file."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-daemon-2.41.0-1.2.aarch64.rpm"
RPM_HASH = "2084531d62d4beb49d22a747dcf9cf7b6aa664809cfd375858ef5c64ac99602f15ce6ff964700f5d269e2b844430c56d99575ef250d31334b8bad59bcb052aac"

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
