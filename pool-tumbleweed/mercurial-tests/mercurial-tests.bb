SUMMARY = "Mercurial tests"
DESCRIPTION = "Mercurial is a fast, lightweight source control management system \
designed for efficient handling of very large distributed projects. \
 \
This package contains its tests."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.4"

RPM_NAME = "mercurial-tests-6.4.4-1.2.aarch64.rpm"
RPM_HASH = "11979d7d87f1dec2fa534f274068117b4ae58505413cfdc84dea966faa41ededb2e428a0a705d7ee6ea61e85c01f88c68335e7fe95873042947397ab9757d3bf"

RPROVIDES:${PN} += "mercurial-tests"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
mercurial"

inherit rpm
