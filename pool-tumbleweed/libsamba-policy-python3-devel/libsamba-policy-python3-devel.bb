SUMMARY = "Development files for the Samba AD Group Policy library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libsamba-policy."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "libsamba-policy-python3-devel-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "5552c84c320b3b938ce4e267b8acbe20bc30a3c5ffce6dbabf31086f442f7a540fa78e201e310c9f5209d9fcd18621ba9a2c9e6f7c599346848174b610418085"

RPROVIDES:${PN} += "libsamba-policy-python3-devel \
libsamba-policy-python3-devel(aarch-64) \
pkgconfig(samba-policy.cpython-310-aarch64-linux-gnu)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsamba-policy0-python3 \
pkgconfig(ldb) \
pkgconfig(talloc)"

inherit rpm
