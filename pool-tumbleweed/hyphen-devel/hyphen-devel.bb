SUMMARY = "Files for Developing with hyphen"
DESCRIPTION = "Hyphen is a library for high quality hyphenation and justification. \
 \
This package contains the hyphen development files."
LICENSE = "GPL-2.0+ | LGPL-2.0+ | MPL-1.1+"

PV = "2.8.8"

RPM_NAME = "hyphen-devel-2.8.8-2.27.aarch64.rpm"
RPM_HASH = "cc58cb00ab18db13cd877a9b269df031abb853e62ad4876160e0be278fd30041e202acd1cc6e936b44d7a251f45691cde58309995d58a8f9919b01fe13969ea2"

RPROVIDES:${PN} += "hyphen-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
libhyphen0"

inherit rpm
