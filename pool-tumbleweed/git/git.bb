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

PV = "2.42.0"

RPM_NAME = "git-2.42.0-1.1.aarch64.rpm"
RPM_HASH = "d8776f448af672673b8b5a244e2be7b5663e5e9e6f481a39e347e19d652744ae18496a5bb2ce2b21843dc4ef926907186dd82b6196955edf75e3f04ede703145"

RPROVIDES:${PN} += "git"

RDEPENDS:${PN} += "git-core \
perl-Git"

inherit rpm
