SUMMARY = "DICT protocol (RFC 2229) server and command-line client"
DESCRIPTION = "This package contains two programs. dict gives access to \
electronic dictionaries on the Internet. With dictd, one can \
set up a custom dictionary. To look up, for example, the word 'grunt', \
execute `dict grunt` at a command line. See the man pages of dict and \
dictd for details."
LICENSE = "GPL-1.0-or-later & Zlib & MIT"

PV = "1.13.1"

RPM_NAME = "dictd-1.13.1-1.9.aarch64.rpm"
RPM_HASH = "b7cf7922ae762f106b5ca72dd0233c2f0dab17d135692826e112854c622c938f9c27ba71000846290b259816acda4e6965a5e85311b94bdbe629ec7840e3df3c"

RPROVIDES:${PN} += "config-dictd \
dictd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbi.so.3 \
libmaa.so.4 \
libz.so.1"

inherit rpm
