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

RPM_NAME = "apparmor-profiles-3.1.6-1.1.noarch.rpm"
RPM_HASH = "ac305353b71ce85ec86bb8c81152322536b913283835e08b593198eae31aac58ea95f29a0e25f2600642747b133c48b695db47d0e1905d1e8a040d4f6bbb358a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-profiles \
config-apparmor-profiles \
subdomain-profiles"

RDEPENDS:${PN} += "/usr/bin/sh \
apparmor-abstractions \
apparmor-parser-CAP-SYSLOG"

inherit rpm
