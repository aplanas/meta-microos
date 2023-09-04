SUMMARY = "Documentation for Pluggable Authentication Modules"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains the documentation."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-doc-1.5.3-2.1.noarch.rpm"
RPM_HASH = "b2cc72fe547b0067b292d4b46a070b2426855127a2522e63b60e34edcafa81109928157390f2b9c138fbbb5107c1fecd9c5d6ff1b133ba343d6b66a5f898107b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pam-doc"

RDEPENDS:${PN} += ""

inherit rpm
