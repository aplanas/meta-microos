SUMMARY = "Command Line Tool for Searching Electronic Dictionaries"
DESCRIPTION = "eblook is a command line tool that uses the EB library. It provides \
easy access to many electronic dictionaries published on CD-ROM. \
 \
It is recommended that you install the Emacs interface lookup.el, too. \
Although it is possible to use eblook from the command line, using it \
with Emacs or XEmacs and lookup.el is much easier and offers many extra \
features. \
 \
You can get lookup.el from http://lookup.sourceforge.net/. \
 \
lookup.el is already included as a package in recent versions of \
XEmacs."
LICENSE = "GPL-2.0+"

PV = "1.6.1"

RPM_NAME = "eblook-1.6.1-161.28.aarch64.rpm"
RPM_HASH = "14c7e713d851b5123875155d6fac03fe89e515823b5c8f8217cc8ed49f194ec0cdf38bf2a55099ebc43fa1c653c371c713cecf2410035b1aafe1b8613fc8b197"

RPROVIDES:${PN} += "eblook eblook(aarch-64)"
RDEPENDS:${PN} += "/bin/sh eb ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libeb.so.16()(64bit)"

inherit rpm
