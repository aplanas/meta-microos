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

RPM_NAME = "apparmor-abstractions-3.1.6-4.1.noarch.rpm"
RPM_HASH = "6f7ee4d1c4314ea96718c78387b89c1d3b4f5b7d22809022a221ce5ec4870693f8b28558a9ff1fbc19f701f3ea0f0e548a4f81bf76d62b5bd05d23501e2434f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-abstractions \
config-apparmor-abstractions"

RDEPENDS:${PN} += "/usr/bin/sh \
apparmor-parser-CAP-SYSLOG"

inherit rpm
