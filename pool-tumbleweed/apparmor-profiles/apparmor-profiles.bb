SUMMARY = "AppArmor profiles that are loaded into the apparmor kernel module"
DESCRIPTION = "Base profiles. AppArmor is a file and network mandatory access control \
mechanism. AppArmor confines processes to the resources allowed by the \
systems administrator and can constrain the scope of potential security \
vulnerabilities. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "apparmor-profiles-3.1.4-1.1.noarch.rpm"
RPM_HASH = "fa84197683bb778a8f918b2737238ac201256ac72312d371088609ff8581217b75130b8e31797437c63a337864ce840ac53f016e052f531e08fbc273e52c922c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-profiles \
config(apparmor-profiles) \
subdomain-profiles"

RDEPENDS:${PN} += "/bin/sh \
apparmor-abstractions \
apparmor-parser(CAP_SYSLOG)"

inherit rpm
