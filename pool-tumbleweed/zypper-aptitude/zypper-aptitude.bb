SUMMARY = "aptitude compatibility with zypper"
DESCRIPTION = "provides compatibility to Debian's aptitude command using zypper \
 \
Authors: \
-------- \
    Bernhard M. Wiedemann <bernhard+aptitude4zypp lsmod de>"
LICENSE = "GPL-2.0-or-later"

PV = "1.14.64"

RPM_NAME = "zypper-aptitude-1.14.64-1.1.noarch.rpm"
RPM_HASH = "acc05f939bb791ec31db766a40720aeb93d7cd45f9185aa399e865058ae9fcd11f482b7a494840e8363ebf34a2ae85d517ef64f3611ac892c978c52e25103e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-zypper-aptitude \
zypper-aptitude"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
zypper"

inherit rpm
