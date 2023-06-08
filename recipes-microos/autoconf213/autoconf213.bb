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

RPM_NAME = "autoconf213-2.13-28.12.noarch.rpm"
RPM_HASH = "8735c68ce0c14da9eb07faa923e000137fccafbc96696817311d3b4251aca5283068bd9cce8726428f266e7da6948f52906e12bd1ab19bafaa2abc3d8825ff41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autoconf213"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl gawk m4 mktemp perl"

inherit rpm
