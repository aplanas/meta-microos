SUMMARY = "Documentation for the Git version control system"
DESCRIPTION = "Git is a fast, scalable, distributed revision control system with an \
unusually rich command set that provides both high-level operations and \
full access to internals. \
 \
This subpackage contains Git's documentation in text/plain and \
text/html formats. (The manpages are in the main package.)"
LICENSE = "GPL-2.0-only"

PV = "2.42.0"

RPM_NAME = "git-doc-2.42.0-1.1.noarch.rpm"
RPM_HASH = "489f1b4623bff86d246f6130769140bc730c846d328835074cf76cd3c53cb60e8dd808fb6a2a3cdc9e83b4cbff512c4fe127e838c2cd0589612d41bc88ac7e8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-doc"

RDEPENDS:${PN} += ""

inherit rpm
