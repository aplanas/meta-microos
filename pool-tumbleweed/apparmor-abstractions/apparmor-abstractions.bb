SUMMARY = "AppArmor abstractions and directory structure"
DESCRIPTION = "AppArmor abstractions (common parts used in various profiles) and \
the /etc/apparmor.d/ directory structure. \
 \
AppArmor is a file and network mandatory access control mechanism. \
AppArmor confines processes to the resources allowed by the systems \
administrator and can constrain the scope of potential security \
vulnerabilities. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "apparmor-abstractions-3.1.6-1.1.noarch.rpm"
RPM_HASH = "9692f0c50625165e1941a240317622f53c64b4c4de404824a9c02e42a3f93b0082ca7ff247245a8e0ba84d386b97eee9fbc838f14025fcbfc12cfd5a9c00cccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-abstractions \
config-apparmor-abstractions"

RDEPENDS:${PN} += "/usr/bin/sh \
apparmor-parser-CAP-SYSLOG"

inherit rpm
