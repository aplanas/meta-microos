SUMMARY = "Documentation for Pluggable Authentication Modules"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains the documentation."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-doc-1.5.3-1.2.noarch.rpm"
RPM_HASH = "9be408d8e812df84fd9a3295e863238b992e32a462dbd42b16cc7e0cf26906d72e8a6c718540de40d0d18bfff807e58c6e7c03c15e95295d136cbaad81b7dccd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pam-doc"

RDEPENDS:${PN} += ""

inherit rpm
