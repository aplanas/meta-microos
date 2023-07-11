SUMMARY = "Shared library libopts"
DESCRIPTION = "AutoOpts is a tool that virtually eliminates the hassle of processing \
options and keeping man pages, info docs and usage text up to date.  This \
package allows you to specify several program attributes, thousands of \
option types and many option attributes.  From this, it then produces all \
the code necessary to parse and handle the command line and configuration \
file options, and the documentation that should go with your program as \
well. \
 \
This package contains shared library libopts"
LICENSE = "GPL-3.0-or-later"

PV = "5.18.16"

RPM_NAME = "libopts25-5.18.16-7.7.aarch64.rpm"
RPM_HASH = "5bf2d0a4996d133b02af965f8a54766223608946ceb0ac65f702dee36ffd6baa5fecbe7b09dc58e45412f023ef9e1632294c6ae9932ba9796b9d7cebd7f2ea77"

RPROVIDES:${PN} += "libopts.so.25 \
libopts25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
