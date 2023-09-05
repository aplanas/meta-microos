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

RPM_NAME = "apparmor-profiles-3.1.6-4.1.noarch.rpm"
RPM_HASH = "0c95122de1984d488b5f9f5f24a075452d41d32d1564316919628a35580d982f6f9b6d292da2ff296bc6690557e890351b24b81903a0eb59aebce7e57e95dfd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-profiles \
config-apparmor-profiles \
subdomain-profiles"

RDEPENDS:${PN} += "/usr/bin/sh \
apparmor-abstractions \
apparmor-parser-CAP-SYSLOG"

inherit rpm
