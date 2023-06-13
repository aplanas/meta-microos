SUMMARY = "Documentation for the Git version control system"
DESCRIPTION = "Git is a fast, scalable, distributed revision control system with an \
unusually rich command set that provides both high-level operations and \
full access to internals. \
 \
This subpackage contains Git's documentation in text/plain and \
text/html formats. (The manpages are in the main package.)"
LICENSE = "GPL-2.0-only"

PV = "2.40.1"

RPM_NAME = "git-doc-2.40.1-1.1.noarch.rpm"
RPM_HASH = "1af9c718e5221d4d6c75d10ee054af18a8d9299702f01fd732ea7deab1408dbaa998e5618ffbb99d4d2f82c3415f5ca1a630e4df7b4c51dc9ef6778976c7881f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-doc"

RDEPENDS:${PN} += ""

inherit rpm
