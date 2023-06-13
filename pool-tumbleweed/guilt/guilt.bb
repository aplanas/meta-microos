SUMMARY = "quilt on top of git"
DESCRIPTION = "Andrew Morton originally developed a set of scripts for maintaining \
kernel patches outside of any SCM tool. Others extended these into a \
suite called quilt. The basic idea behind quilt is to maintain patches \
instead of maintaining source files. Patches can be added, removed or \
reordered, and they can be refreshed as you fix bugs or update to a new \
base revision. quilt is very powerful, but it is not integrated with \
the underlying SCM tools. This makes it difficult to visualize your \
changes. \
 \
Guilt allows one to use quilt functionality on top of a Git repository. \
Changes are maintained as patches which are committed into Git. \
Commits can be removed or reordered, and the underlying patch can be \
refreshed based on changes made in the working directory. The patch \
directory can also be placed under revision control, so you can have a \
separate history of changes made to your patches."
LICENSE = "GPL-2.0-only"

PV = "0.36"

RPM_NAME = "guilt-0.36-1.5.noarch.rpm"
RPM_HASH = "73cd02f184345956dbe042a67cfc2f0c68b11a7f66b9346f81f4824d6668ee93c0cfa91085eee3905403bec18963fef991d727ba0a0df36a8b1fddc774b825c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guilt"

RDEPENDS:${PN} += "/bin/sh \
git"

inherit rpm
