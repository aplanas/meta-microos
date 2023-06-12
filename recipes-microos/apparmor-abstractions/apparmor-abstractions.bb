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

PV = "3.1.4"

RPM_NAME = "apparmor-abstractions-3.1.4-1.1.noarch.rpm"
RPM_HASH = "ed9471f3bebc353c247887b665dc5ae6d949dc7b925c6921e10be1f075a5d2cc56f5948d3c4ab411746e0433e4386d332a77197aa4c68780cff18902bf162fee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-abstractions config(apparmor-abstractions)"
RDEPENDS:${PN} += "/bin/sh apparmor-parser(CAP_SYSLOG)"

inherit rpm
