SUMMARY = "Helper Scripts for system rollback"
DESCRIPTION = "The rollback-helper package is a collection of scripts, which, \
after a successfull filesystem rollback with snapper, resets \
registered products on SCC or SMT."
LICENSE = "GPL-2.0-or-later"

PV = "1.0+git20181218.5394d6e"

RPM_NAME = "rollback-helper-1.0+git20181218.5394d6e-1.12.noarch.rpm"
RPM_HASH = "4862be979ba4f26d198ec76e237e94044179fac86c27e278e3503e85e865cd075a6d2c484dfd8dac37eda012abf8975bd1ca3c32ff5aafafed2912b5669c1379"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rollback-helper"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
SUSEConnect \
systemd"

inherit rpm
