SUMMARY = "Fast, scalable, distributed revision control system"
DESCRIPTION = "Git is a fast, scalable, distributed revision control system with an \
unusually rich command set that provides both high-level operations and \
full access to internals. \
 \
This package itself only provides the README of git but with the \
packages it requires, it brings you a complete Git environment \
including GTK and email interfaces and tools for importing source code \
repositories from other revision control systems such as subversion, \
CVS, and GNU arch."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-2.41.0-1.3.aarch64.rpm"
RPM_HASH = "e7a5278f437e40fa6084d32ca930643e2f413c21707d788e31a5a058d7767dfa7ed74f5b8af9a4efc7efe3b8e95265ca0e8f824056dca0cbc6a31ec71434999c"

RPROVIDES:${PN} += "git"

RDEPENDS:${PN} += "git-core \
perl-Git"

inherit rpm
