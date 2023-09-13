SUMMARY = "Non-blocking system DNS resolver"
DESCRIPTION = "This class provides several methods for host name resolution. It is \
designed to be used with event loops. All resolving are done by \
getaddrinfo(3) implemented in your system library. Since getaddrinfo() is \
blocking function and we don't want to block, calls to this function will \
be done in separate thread. This class uses system native threads and not \
perl threads. So overhead shouldn't be too big."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.220.0"

RPM_NAME = "perl-Net-DNS-Native-0.220.0-1.1.aarch64.rpm"
RPM_HASH = "5a2118de8aba98cce457ea4c60e93d4031dadbaf59649a732a76b981329d4224bb59261fca43b01a913d448f6e69e51119b0521a0c0f5188f5e0c34ed5f778f2"

RPROVIDES:${PN} += "perl-Net--DNS--Native \
perl-Net--DNS--Native--Handle \
perl-Net-DNS-Native"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Socket"

inherit rpm
