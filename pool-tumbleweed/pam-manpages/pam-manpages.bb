SUMMARY = "Manualpages for Pluggable Authentication Modules"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains the manual pages."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-manpages-1.5.3-1.1.noarch.rpm"
RPM_HASH = "449905512fa48b6c0615cd2a8b78e1046432ca5d150a723f82a8cebd8635aafd0a167df8ba32ba0ab6b09ddd10e0f5c70070ea410bcc04d9e957296b06fb44d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pam-manpages \
pam://usr/share/man/man8/PAM.8.gz"

RDEPENDS:${PN} += ""

inherit rpm
