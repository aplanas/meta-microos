SUMMARY = "aptitude compatibility with zypper"
DESCRIPTION = "provides compatibility to Debian's aptitude command using zypper \
 \
Authors: \
-------- \
    Bernhard M. Wiedemann <bernhard+aptitude4zypp lsmod de>"
LICENSE = "GPL-2.0-or-later"

PV = "1.14.62"

RPM_NAME = "zypper-aptitude-1.14.62-1.1.noarch.rpm"
RPM_HASH = "06848fac1003339c8045df29946cfaeaa0ba6afa85a8de53a011c0194260c2106fc3578f110e35d97d29bd5d3e9a7268ad9b0e7eaaf6a0ec49e2c97488e24437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-zypper-aptitude \
zypper-aptitude"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
zypper"

inherit rpm
