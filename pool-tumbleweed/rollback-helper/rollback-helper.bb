SUMMARY = "Helper Scripts for system rollback"
DESCRIPTION = "The rollback-helper package is a collection of scripts, which, \
after a successfull filesystem rollback with snapper, resets \
registered products on SCC or SMT."
LICENSE = "GPL-2.0-or-later"

PV = "1.0+git20181218.5394d6e"

RPM_NAME = "rollback-helper-1.0+git20181218.5394d6e-1.11.noarch.rpm"
RPM_HASH = "298e3aa470889886244c54f8ea1e8357b96851bfa581571b7e29db3912aeb701b3edb0cd12627cf25cdcc74cdd53aa081a672f3b8637e0dedc21bdbb511e7a1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rollback-helper"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
SUSEConnect \
systemd"

inherit rpm
