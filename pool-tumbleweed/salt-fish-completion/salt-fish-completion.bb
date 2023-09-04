SUMMARY = "Fish Completion for salt"
DESCRIPTION = "Fish command line completion support for salt."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-fish-completion-3006.0-2.1.noarch.rpm"
RPM_HASH = "cd7dd54fe4b1dd63aa97c4bc127eb7dfbabfa8652996c633c36aedd15c8165921356e8e8c572c9f8965461ee3d09a8b3518001f0df9bc1275ce410845006ae2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "salt-fish-completion"

RDEPENDS:${PN} += "salt"

inherit rpm
