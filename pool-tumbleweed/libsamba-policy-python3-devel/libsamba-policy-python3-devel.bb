SUMMARY = "Development files for the Samba AD Group Policy library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libsamba-policy."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.3+git.303.c08b73d523c"

RPM_NAME = "libsamba-policy-python3-devel-4.18.3+git.303.c08b73d523c-1.2.aarch64.rpm"
RPM_HASH = "5f2c75d2f5c03c94d3cafd1bb4832f4c92ce1834787fdb48c35b552ffc3f295b36615ab92bc07ae3db7b13577a6d43cab95335ea6462f6d7fbb7f4754241a03a"

RPROVIDES:${PN} += "libsamba-policy-python3-devel \
pkgconfig-samba-policy.cpython-311-aarch64-linux-gnu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsamba-policy0-python3 \
pkgconfig-ldb \
pkgconfig-talloc"

inherit rpm
