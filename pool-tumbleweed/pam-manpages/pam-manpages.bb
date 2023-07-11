SUMMARY = "Manualpages for Pluggable Authentication Modules"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains the manual pages."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-manpages-1.5.3-1.2.noarch.rpm"
RPM_HASH = "59ee1457d471747cada0d138e6490b8e0cce7b83ffbab962c73f1d398b6157f1a9165e92740d36c47b1ed0e1037276d0349be81e1756738e8b08e2550e4e6b33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pam-//usr/share/man/man8/PAM.8.gz \
pam-manpages"

RDEPENDS:${PN} += ""

inherit rpm
