SUMMARY = "aptitude compatibility with zypper"
DESCRIPTION = "provides compatibility to Debian's aptitude command using zypper \
 \
Authors: \
-------- \
    Bernhard M. Wiedemann <bernhard+aptitude4zypp lsmod de>"
LICENSE = "GPL-2.0-or-later"

PV = "1.14.61"

RPM_NAME = "zypper-aptitude-1.14.61-1.1.noarch.rpm"
RPM_HASH = "f836c956bef87bb0e5dcb4ea77e5d86b7e425bf5cbb36c32ba93ca52fc7134eb7830c38a8a4deecd7b0cdd2806bfd2cfd8f4fdecbec79228d01614a4bc9bf54c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-zypper-aptitude \
zypper-aptitude"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
zypper"

inherit rpm
