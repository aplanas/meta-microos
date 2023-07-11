SUMMARY = "Development files for the Dante SOCKSv4/v5 library"
DESCRIPTION = "Dante is an implementation of the following proxy protocols: SOCKS \
version 4, SOCKS version 5 (RFC 1928), and msproxy. \
 \
This package contains the header files for Dante."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "dante-devel-1.4.3-2.9.aarch64.rpm"
RPM_HASH = "c4019b223b7a51e7ba18c4400d92da5ea4f0b946d8533d4704c124c6b5999c6bf6ac5c564dadce745ac3955fab5af1e3b4b8114d6fdb255398bc64a6bcc1cd4f"

RPROVIDES:${PN} += "dante-devel \
dantedev"

RDEPENDS:${PN} += "libsocks0"

inherit rpm
