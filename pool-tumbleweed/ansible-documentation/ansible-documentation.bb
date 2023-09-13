SUMMARY = "Ansible community documentation and example files"
DESCRIPTION = "User documentation and example files related to the Ansible package and Ansible core."
LICENSE = "GPL-3.0"

PV = "2.15.3"

RPM_NAME = "ansible-documentation-2.15.3-1.1.noarch.rpm"
RPM_HASH = "9fdf3470b52c0b341cfa542a5620296c6d8a0442923ed3c8b08c135e1ec95f0f054ec0ecacd154c15773a2e1e4e8b6392481deaa5b03cb309090b41078455f97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansible-documentation \
config-ansible-documentation"

RDEPENDS:${PN} += "ansible-core"

inherit rpm
