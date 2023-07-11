SUMMARY = "A GNU Tool for Automatically Configuring Source Code"
DESCRIPTION = "GNU Autoconf is a tool for configuring source code and makefiles. Using \
autoconf, programmers can create portable and configurable packages, \
because the person building the package is allowed to specify various \
configuration options. \
 \
You should install autoconf if you are developing software and would \
like to create shell scripts to configure your source code packages. \
 \
Note that the autoconf package is not required for the end user who may \
be configuring software with an autoconf-generated script; autoconf is \
only required for the generation of the scripts, not their use."
LICENSE = "GPL-2.0-or-later"

PV = "2.13"

RPM_NAME = "autoconf213-2.13-28.13.noarch.rpm"
RPM_HASH = "cef0d45e31da6ab3c9068709cacfce4f93f447b21b2a471ad392cfd192d239e0ac7c2af398426cb098be36527d9bfd816f3d313832df106954bea09a6bacfd6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autoconf213"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
gawk \
m4 \
mktemp \
perl"

inherit rpm
