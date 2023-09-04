SUMMARY = "Documentation for the Git version control system"
DESCRIPTION = "Git is a fast, scalable, distributed revision control system with an \
unusually rich command set that provides both high-level operations and \
full access to internals. \
 \
This subpackage contains Git's documentation in text/plain and \
text/html formats. (The manpages are in the main package.)"
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-doc-2.41.0-1.3.noarch.rpm"
RPM_HASH = "8f4ad134f580fc5f5305ca3b1cc00d8728f7c68f3c2ab871ac578295717aa2e00855fddd257ec7237a2278c4c36945b1ff94b80ac4e59afa51be24fb0cb2fd9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-doc"

RDEPENDS:${PN} += ""

inherit rpm
