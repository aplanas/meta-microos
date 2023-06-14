SUMMARY = "BCUnit shared library"
DESCRIPTION = "BCUnit is a unit testing framework for C. \
This package installs the BCUnit shared library."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0.2+git.20191119"

RPM_NAME = "libbcunit1-3.0.2+git.20191119-1.13.aarch64.rpm"
RPM_HASH = "ff56d3ae672183bb867f2819665435a194857139692873cfecc220e0abd350d071fddada34efc56bb91c62523bfe4e4cf4c40690b2941d3e1389715a68f996c5"

RPROVIDES:${PN} += "libbcunit.so.1 \
libbcunit1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
