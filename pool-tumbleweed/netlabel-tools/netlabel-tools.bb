SUMMARY = "Control utility for explicit labeled networking for Linux"
DESCRIPTION = "Explicit labeled networking for Linux \
 \
The NetLabel control utility, netlabelctl, is a command line program designed \
to allow system administrators to configure the NetLabel system in the kernel. \
The utility is based around different 'modules' which correspond to the \
different types of NetLabel commands supported by the kernel."
LICENSE = "GPL-2.0-only"

PV = "0.21"

RPM_NAME = "netlabel-tools-0.21-3.6.aarch64.rpm"
RPM_HASH = "d04ea74c01cfb22c4f3abe102aea6f4b2685098f62e96628dd5234b38335d9cc8d9f717b12951086b3a917e153d72283f2b2472fc3cdff689c46b1d9f45ef79e"

RPROVIDES:${PN} += "config(netlabel-tools) \
netlabel-tools \
netlabel-tools(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit)"

inherit rpm
