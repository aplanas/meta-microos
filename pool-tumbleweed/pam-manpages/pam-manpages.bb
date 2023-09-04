SUMMARY = "Manualpages for Pluggable Authentication Modules"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains the manual pages."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-manpages-1.5.3-2.1.noarch.rpm"
RPM_HASH = "dfbcb28a69f34cda38a73a615ddf2ab818b0f73f9d7178ac8013c5ba70abb75aec74195d89fd076591bfb1c48b2aa57d8c3d5d05042de4bbb397b694f9d420b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pam-//usr/share/man/man8/PAM.8.gz \
pam-manpages"

RDEPENDS:${PN} += ""

inherit rpm
