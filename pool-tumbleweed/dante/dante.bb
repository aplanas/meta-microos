SUMMARY = "A SOCKSv4 and v5 client implementation"
DESCRIPTION = "Dante is an implementation of the following proxy protocols: SOCKS \
version 4, SOCKS version 5 (RFC 1928), and msproxy. It can be used as a \
firewall between networks."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "dante-1.4.3-2.9.aarch64.rpm"
RPM_HASH = "01a720c1300fe5319828c931127673729274fce08954700308096a38c60c355906889bd4ffe9339d7ead5e4ad10365a7a2aaf99dc0c7b66f444124516aad7083"

RPROVIDES:${PN} += "config-dante \
dante \
libdsocks.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
libminiupnpc.so.17"

inherit rpm
