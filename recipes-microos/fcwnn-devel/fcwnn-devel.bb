SUMMARY = "Development Libraries and Header Files for Free cWnn"
DESCRIPTION = "This package contains the header files and libraries for building \
client programs that use the Chinese Input System, Free cWnn."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "fcwnn-devel-1.1.1a023.1-4.3.aarch64.rpm"
RPM_HASH = "22cede3897f1abbfcce38f511f9bfb6f9f69229e6ac1cf7ea8564edd0319567c135f83916fa727c83df7254d59c4ad326b6dc5569f198a02f216766acfb3db76"

RPROVIDES:${PN} += "fcwnn-devel fcwnn-devel(aarch-64) fcwnndev"
RDEPENDS:${PN} += "fcwnn libcwnn0"

inherit rpm
