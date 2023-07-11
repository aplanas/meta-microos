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

RPM_NAME = "autoopts-5.18.16-7.7.aarch64.rpm"
RPM_HASH = "1a4393c3c27399174bef86d949158be3a073ea595833449105e57150c626b70121c909e1dd5c24556748dd03bf86b07d9e4e149751d2a69c8d24005edeae7548"

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
