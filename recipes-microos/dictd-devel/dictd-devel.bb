SUMMARY = "Development files for dictd"
DESCRIPTION = "This package contains two programs. dict gives access to \
electronic dictionaries on the Internet. With dictd, one can \
set up a custom dictionary. To look up, for example, the word 'grunt', \
execute `dict grunt` at a command line. See the man pages of dict and \
dictd for details. \
 \
This package contains development files for the dictd package."
LICENSE = "GPL-1.0-or-later & Zlib & MIT"

PV = "1.13.1"

RPM_NAME = "dictd-devel-1.13.1-1.8.aarch64.rpm"
RPM_HASH = "2abe3ee3f7376577f04efac36694f3b9b51982da63de16b4b440ee493f2313d988030932aee15d54fd5f5052d09a2c0dff86138b2dc6b4653bb7677085446669"

RPROVIDES:${PN} += "dictd-devel dictd-devel(aarch-64)"
RDEPENDS:${PN} += "dictd"

inherit rpm
