SUMMARY = "Development files for the Samba AD Group Policy library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libsamba-policy."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.6+git.320.cfda27bacb"

RPM_NAME = "libsamba-policy-python3-devel-4.18.6+git.320.cfda27bacb-1.1.aarch64.rpm"
RPM_HASH = "c98bc444fe69892667db42e866fa42a10faafbc9212169316601b6864be13cde32caf0a3119a4da4a39ae9cc974cfa3a653d60d5204687c65e8c266085b7da6d"

RPROVIDES:${PN} += "libsamba-policy-python3-devel \
pkgconfig-samba-policy.cpython-311-aarch64-linux-gnu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsamba-policy0-python3 \
pkgconfig-ldb \
pkgconfig-talloc"

inherit rpm
