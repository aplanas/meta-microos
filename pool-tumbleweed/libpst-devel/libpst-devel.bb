SUMMARY = "Development files for libpst, a .pst file reader"
DESCRIPTION = "libpst is a library that can decode the email messages stored in a \
'PST' file as created by Outlook. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libpst."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.76"

RPM_NAME = "libpst-devel-0.6.76-1.3.aarch64.rpm"
RPM_HASH = "431e16dd5ac950a4e58a628043c928132fd091842ea4eb712d95c870053538b2dd4ed3b6cccf0db03cd34798a81bdce6de3aadd06ab149e4e73d9e829a21b733"

RPROVIDES:${PN} += "libpst-devel \
libpst-devel(aarch-64) \
pkgconfig(libpst)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpst4"

inherit rpm
