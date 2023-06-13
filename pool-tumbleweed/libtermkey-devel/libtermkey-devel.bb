SUMMARY = "Development files for libtermkey, a keyboard entry processing library"
DESCRIPTION = "This library allows easy processing of keyboard entry from terminal-based \
programs. It handles all the necessary logic to recognise special keys, UTF-8 \
combining, and so on, with a simple interface."
LICENSE = "MIT"

PV = "0.22"

RPM_NAME = "libtermkey-devel-0.22-2.5.aarch64.rpm"
RPM_HASH = "3b77ca171f794694ae6837ce467e04997ae2d0ae5bbbb37a7e2a993613f42a3440d9a6704d8e50aacbaeb01b11c5103f2b4871c6a720c53abb7d91f2f07b8f2e"

RPROVIDES:${PN} += "libtermkey-devel \
libtermkey-devel(aarch-64) \
pkgconfig(termkey)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtermkey1 \
ncurses-devel \
pkgconfig"

inherit rpm
