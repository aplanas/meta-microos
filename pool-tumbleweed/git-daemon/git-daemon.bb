SUMMARY = "Simple Server for Git Repositories"
DESCRIPTION = "A really simple TCP git daemon. In the default configuration it allows \
read only access to repositories in /srv/git/ that contain the \
'git-daemon-export-ok' file."
LICENSE = "GPL-2.0-only"

PV = "2.40.1"

RPM_NAME = "git-daemon-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "c3eb336118760e00ef4645bac9c13c809d1de23defa23fb4b8ed699aff660d76220bb795d7896008c3547b1c064d150acdf2195a7e6ad18956c6914ccde7744b"

RPROVIDES:${PN} += "git-daemon \
git-daemon(aarch-64) \
group(git-daemon) \
user(git-daemon)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
bash \
fillup \
git-core \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpcre2-8.so.0()(64bit) \
libsha1detectcoll.so.1()(64bit) \
libz.so.1()(64bit) \
systemd \
sysuser-shadow"

inherit rpm