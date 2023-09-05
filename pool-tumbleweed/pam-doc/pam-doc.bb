SUMMARY = "Documentation for Pluggable Authentication Modules"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains the documentation."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-doc-1.5.3-3.1.noarch.rpm"
RPM_HASH = "64ccd8f1d006f1171dfe6b0e34f3e5e023654faea13109f1c3f857ef63b1ba6a882d40193d429ad5103cc03bf1270d99a20d7da5130a8c4c84627f319fdf41e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pam-doc"

RDEPENDS:${PN} += ""

inherit rpm
