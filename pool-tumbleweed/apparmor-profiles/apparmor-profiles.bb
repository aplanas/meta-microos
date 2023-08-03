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

RPM_NAME = "apparmor-profiles-3.1.6-2.1.noarch.rpm"
RPM_HASH = "bdd0f6618e83027c68fd40114cf7ec6c0d675c84e450b754ee7f8bd7c28c73d0edc48ffdbc41a8483fdb1f09d9e72e5be5a1dd5b0c8cefc6a0a32013f2f4689f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apparmor-profiles \
config-apparmor-profiles \
subdomain-profiles"

RDEPENDS:${PN} += "/usr/bin/sh \
apparmor-abstractions \
apparmor-parser-CAP-SYSLOG"

inherit rpm
