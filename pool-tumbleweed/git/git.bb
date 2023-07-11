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

RPM_NAME = "git-2.41.0-1.2.aarch64.rpm"
RPM_HASH = "553f57c2336f8a8cb3dc98dd3868b1341b565370be5b69d4bdc1e3ca19d35ed7baa9f8bdc10258d0f8c1bf8a10771f22842f379b38fef8e92ed124a5e73e926b"

RPROVIDES:${PN} += "git"

RDEPENDS:${PN} += "git-core \
perl-Git"

inherit rpm
