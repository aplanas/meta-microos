SUMMARY = "FreeIPMI library"
DESCRIPTION = "This project provides 'Remote-Console' (out-of-band) and \
'System Management Software' (in-band) based on Intelligent \
Platform Management Interface specification. \
 \
This package contains the libipmimonitoring library."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.11"

RPM_NAME = "libipmimonitoring6-1.6.11-1.1.aarch64.rpm"
RPM_HASH = "3f34dccacdf8bae0a2591badb6ce9d0d23b0f87b53076966a5317bfdb7c759bc868dc0c1804492c8067e5483761aefecdb9a2a79d1726f2ac1b66eb911cf0fcb"

RPROVIDES:${PN} += "libipmimonitoring.so.6 \
libipmimonitoring6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreeipmi.so.17"

inherit rpm
