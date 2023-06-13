SUMMARY = "Documentation for Pluggable Authentication Modules"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains the documentation."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-doc-1.5.3-1.1.noarch.rpm"
RPM_HASH = "f9b19964258bd6e1b3fb363f73c4ea90c799047518ba71789f9672f2ec34d0f9f623630765eb55a66706fd9b1b3afb08b3bd65f4a103e634ea56a97d783f4c25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pam-doc"

RDEPENDS:${PN} += ""

inherit rpm
