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

PV = "3.1.3"

RPM_NAME = "apparmor-abstractions-3.1.3-2.1.noarch.rpm"
RPM_HASH = "8f9854ee131638c39ecb40aa31376b1c2052039b585b8ce004529e29720c6f1d4231fe8981ee0728dbe0778af34275d8efab822c4de6ab95db6b8f175c9cf0d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-abstractions config(apparmor-abstractions)"
RDEPENDS:${PN} += "/bin/sh apparmor-parser(CAP_SYSLOG)"

inherit rpm
