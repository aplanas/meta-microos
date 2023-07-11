SUMMARY = "Samba Documentation"
DESCRIPTION = "This package contains all the Samba documentation as it is not part of \
the man pages."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.3+git.303.c08b73d523c"

RPM_NAME = "samba-doc-4.18.3+git.303.c08b73d523c-1.2.noarch.rpm"
RPM_HASH = "85544797ed9ff82d0739908eaeacf54dd6d0a3f95bcafa1c15e79f0d788c4228939cfd2d26f6dd39bcf6cbdc10cb5c997827c948d2dac0a142929369b3fa50b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "samba-doc"

RDEPENDS:${PN} += "coreutils \
findutils"

inherit rpm
