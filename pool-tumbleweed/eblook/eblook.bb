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

RPM_NAME = "eblook-1.6.1-161.29.aarch64.rpm"
RPM_HASH = "6d61143357936c46f1ffeecedb767a46cf84e333586cc95520c1a488aa0e1777f21500509ff4fa1530914b838d43f6dcdb517dc8aeda51a02b65a5b99cf93ba6"

RPROVIDES:${PN} += "eblook"

RDEPENDS:${PN} += "/usr/bin/sh \
eb \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeb.so.16"

inherit rpm
