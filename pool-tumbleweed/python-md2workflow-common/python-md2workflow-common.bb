SUMMARY = "Configuration and examples for md2workflow"
DESCRIPTION = "Configuration and examples for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python-md2workflow-common-1.4.18-4.11.noarch.rpm"
RPM_HASH = "0785bd6548ce4524b45d8f7af52e2229ab757dec6b6ccbd1fb7fb62313dbdff3a48e079ce079683ebc79be34edc981bc8c8f43910ff83223556a8271bbab32f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-md2workflow-common \
python310-md2workflow-common \
python311-md2workflow-common \
python39-md2workflow-common"

RDEPENDS:${PN} += ""

inherit rpm
