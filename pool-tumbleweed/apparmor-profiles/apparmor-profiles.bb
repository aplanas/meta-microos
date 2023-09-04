SUMMARY = "AppArmor profiles that are loaded into the apparmor kernel module"
DESCRIPTION = "Base profiles. AppArmor is a file and network mandatory access control \
mechanism. AppArmor confines processes to the resources allowed by the \
systems administrator and can constrain the scope of potential security \
vulnerabilities. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "apparmor-profiles-3.1.6-2.2.noarch.rpm"
RPM_HASH = "0a12e1016474dceddc155543328df10a090ba468279c4dbe439d8163a85e4226c42273b4b5d89428c6475289722e0b0bfb97d1a3cdad9f5d29420ae3e9e087de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-profiles \
config-apparmor-profiles \
subdomain-profiles"

RDEPENDS:${PN} += "/usr/bin/sh \
apparmor-abstractions \
apparmor-parser-CAP-SYSLOG"

inherit rpm
