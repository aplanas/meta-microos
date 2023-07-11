SUMMARY = "Micro is a terminal-based text editor that aims to be easy to use and intuitive"
DESCRIPTION = "Micro is a terminal-based text editor that aims to be easy to use and intuitive, \
while also taking advantage of the full capabilities of modern terminals. \
It comes as one single, batteries-included, static binary with no dependencies, \
and you can download and use it right now. \
 \
As the name indicates, micro aims to be somewhat of a successor to the nano editor \
by being easy to install and use in a pinch, but micro also aims to be enjoyable to \
use full time, whether you work in the terminal because you prefer it (like me), \
or because you need to (over ssh)."
LICENSE = "MIT"

PV = "2.0.11"

RPM_NAME = "micro-editor-2.0.11-2.2.aarch64.rpm"
RPM_HASH = "d021a503e71467860def5ae6d77856ba36cfb2c1e57b6ff70470cfd4668ea0062301e8d17a1932151d9cee228807f0c5efed69c781c75b538f3dfc0ea3ae28e9"

RPROVIDES:${PN} += "micro-editor"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
