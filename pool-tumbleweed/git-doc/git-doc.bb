SUMMARY = "Documentation for the Git version control system"
DESCRIPTION = "Git is a fast, scalable, distributed revision control system with an \
unusually rich command set that provides both high-level operations and \
full access to internals. \
 \
This subpackage contains Git's documentation in text/plain and \
text/html formats. (The manpages are in the main package.)"
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-doc-2.41.0-1.2.noarch.rpm"
RPM_HASH = "2935ad6cad8d234fbe30af7c1f89312e805a0a448e8ca2242e49df6c146e21e3f0fc5f3ca2e9ed6958cddb827936af5bc0e34099449fcb4c977f9123008a2183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-doc"

RDEPENDS:${PN} += ""

inherit rpm
