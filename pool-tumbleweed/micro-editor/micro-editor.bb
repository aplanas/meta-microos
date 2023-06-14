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

RPM_NAME = "micro-editor-2.0.11-2.1.aarch64.rpm"
RPM_HASH = "7706c970f9d831b8973b49c977adcc2d6f9e891be9308b35d69836ad260bc2682466ab80714cf3ef047a8df2e3544326939cd19dd1b7ae86603dac8fe374cb5c"

RPROVIDES:${PN} += "micro-editor"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
