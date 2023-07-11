SUMMARY = "FreeIPMI library"
DESCRIPTION = "This project provides 'Remote-Console' (out-of-band) and \
'System Management Software' (in-band) based on Intelligent \
Platform Management Interface specification. \
 \
This package contains the libipmiconsole library."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.11"

RPM_NAME = "libipmiconsole2-1.6.11-1.1.aarch64.rpm"
RPM_HASH = "f95a98c4da0eb9f1caeb6caa94518a497c8557bc4d162753f9f5db62514eed4692a15bb42fb2447d007c46064187c6009bf6f761dc62022c2d018e211cfeb649"

RPROVIDES:${PN} += "libipmiconsole.so.2 \
libipmiconsole2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreeipmi.so.17"

inherit rpm
