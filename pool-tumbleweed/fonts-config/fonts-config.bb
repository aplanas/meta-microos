SUMMARY = "Script to configure fonts for X Windows and other applications"
DESCRIPTION = "A script to configure fonts for X Windows and other applications. \
 \
fonts-config is usually called automatically when a package containing \
fonts is installed, upgraded or removed. But it can also be executed \
directly, which is mainly useful to debug it (use the --debug flag)."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "20200609+git0.42e2b1b"

RPM_NAME = "fonts-config-20200609+git0.42e2b1b-1.11.noarch.rpm"
RPM_HASH = "c99850c73352d5598a0fecbdb2cae0febb0339c4dbd02e60069c82710dded43fa5802c99c45edf9f48df8474523a6b584629b5f14ac38065cc02a282684c6e8e"
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
