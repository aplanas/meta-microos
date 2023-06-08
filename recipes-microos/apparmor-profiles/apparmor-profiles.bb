SUMMARY = "AppArmor profiles that are loaded into the apparmor kernel module"
DESCRIPTION = "Base profiles. AppArmor is a file and network mandatory access control \
mechanism. AppArmor confines processes to the resources allowed by the \
systems administrator and can constrain the scope of potential security \
vulnerabilities. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.3"

RPM_NAME = "apparmor-profiles-3.1.3-2.1.noarch.rpm"
RPM_HASH = "643768332b788a8ca76d937718e9fe5928555e9cc5a9f45b1459723f7a1773ce4eee632efff5dcdaada57797bacd8647d0f034f4cd5b5b2f0cdb57f231fbc8a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-profiles config(apparmor-profiles) subdomain-profiles"
RDEPENDS:${PN} += "/bin/sh apparmor-abstractions apparmor-parser(CAP_SYSLOG)"

inherit rpm
