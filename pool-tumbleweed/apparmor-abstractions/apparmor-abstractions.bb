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

RPM_NAME = "apparmor-abstractions-3.1.6-2.1.noarch.rpm"
RPM_HASH = "76975e60494e84f0e7564fd8ce5cfff0c5510349d8d8a82ab4b922cb7e4ee60f561f74c2bfe6a1cb063ab29e36fe399fa1336ede0f223ad47861ed0a978a55f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-abstractions \
config-apparmor-abstractions"

RDEPENDS:${PN} += "/usr/bin/sh \
apparmor-parser-CAP-SYSLOG"

inherit rpm
