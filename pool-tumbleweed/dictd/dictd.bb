SUMMARY = "DICT protocol (RFC 2229) server and command-line client"
DESCRIPTION = "This package contains two programs. dict gives access to \
electronic dictionaries on the Internet. With dictd, one can \
set up a custom dictionary. To look up, for example, the word 'grunt', \
execute `dict grunt` at a command line. See the man pages of dict and \
dictd for details."
LICENSE = "GPL-1.0-or-later & Zlib & MIT"

PV = "1.13.1"

RPM_NAME = "dictd-1.13.1-1.8.aarch64.rpm"
RPM_HASH = "b254e776a63e184ea9450d8372e5413a10da7fc827fb1066cacd4168eefa36c76f969f6a2b1f6140a9142babeec7175c5b60f426d25e41e53b9ada4ccaff657d"

RPROVIDES:${PN} += "config(dictd) \
dictd \
dictd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbi.so.3()(64bit) \
libdbi.so.3(ABI_3)(64bit) \
libmaa.so.4()(64bit) \
libz.so.1()(64bit)"

inherit rpm
