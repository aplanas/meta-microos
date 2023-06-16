SUMMARY = "Script to configure fonts for X Windows and other applications"
DESCRIPTION = "A script to configure fonts for X Windows and other applications. \
 \
fonts-config is usually called automatically when a package containing \
fonts is installed, upgraded or removed. But it can also be executed \
directly, which is mainly useful to debug it (use the --debug flag)."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "20200609+git0.42e2b1b"

RPM_NAME = "fonts-config-20200609+git0.42e2b1b-1.10.noarch.rpm"
RPM_HASH = "faabdc99457de5c221b7e976bf0b44fe5fce64aebb4a2db9ae9bbf6b2ca9894d65bbae3923f445ad006f4a0ca26f141f5876662ee396aca821d79e7eb3624fa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-fonts-config \
fonts-config"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
aaa-base \
coreutils \
fillup \
fontconfig \
gawk \
perl \
perl-English"

inherit rpm
