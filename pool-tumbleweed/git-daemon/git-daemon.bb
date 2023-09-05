SUMMARY = "Simple Server for Git Repositories"
DESCRIPTION = "A really simple TCP git daemon. In the default configuration it allows \
read only access to repositories in /srv/git/ that contain the \
'git-daemon-export-ok' file."
LICENSE = "GPL-2.0-only"

PV = "2.42.0"

RPM_NAME = "git-daemon-2.42.0-1.1.aarch64.rpm"
RPM_HASH = "85238c458bdd33a1ab75315f5a0555d0436084075fa0e099695e2ad3527b0284e7e083c3b0af836790705cf9fc02ad41d78e69a8352a383326a0ae94c4104d28"

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
