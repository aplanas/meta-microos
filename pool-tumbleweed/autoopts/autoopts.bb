SUMMARY = "Automated Option Processing"
DESCRIPTION = "AutoOpts is a tool that virtually eliminates the hassle of processing \
options and keeping man pages, info docs and usage text up to date.  This \
package allows you to specify several program attributes, thousands of \
option types and many option attributes.  From this, it then produces all \
the code necessary to parse and handle the command line and configuration \
file options, and the documentation that should go with your program as \
well."
LICENSE = "GPL-3.0-or-later"

PV = "5.18.16"

RPM_NAME = "autoopts-5.18.16-7.6.aarch64.rpm"
RPM_HASH = "0563effbaa0b0ff010b1bd1fc4359d8814cd77ef62cac7efffbbe7104eab5eb2cdfa01f07d6f4d4e2ec81ccaab024f51a0a4d7285521ee3b42994928fb347ee4"

RPROVIDES:${PN} += "autogen-/usr/bin/autoopts-config \
autoopts \
libopts-devel \
perl-Mdoc \
pkgconfig-autoopts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/pkg-config \
autogen \
libopts25"

inherit rpm
