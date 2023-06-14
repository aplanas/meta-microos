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

PV = "2.40.1"

RPM_NAME = "git-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "8a3606b585e17ebf266454ceb0e98f26eb9cac55fd07b0380218f8780c9bc2e27c6a646a85baae44e738e2a65fb0bee6bd56ecc7eab175b0c1a8ee6f4388cdbf"

RPROVIDES:${PN} += "git"

RDEPENDS:${PN} += "git-core \
perl-Git"

inherit rpm
