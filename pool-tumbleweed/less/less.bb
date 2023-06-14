SUMMARY = "Text File Browser and Pager Similar to more"
DESCRIPTION = "less is a text file browser and pager similar to more. It allows \
backward as well as forward movement within a file. Also, less does not \
have to read the entire input file before starting. It is possible to \
start an editor at any time from within less."
LICENSE = "BSD-2-Clause | GPL-3.0-or-later"

PV = "633"

RPM_NAME = "less-633-2.1.aarch64.rpm"
RPM_HASH = "b92417b164794113efa12ed7b49a3c817e9b83b87880a8b3614a00e4a75a8ffec2a117ef7e2a8fbd4f80f954cf968fa20aba2f4cf6e09e32929cad016b3416eb"

RPROVIDES:${PN} += "less"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/which \
file \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
