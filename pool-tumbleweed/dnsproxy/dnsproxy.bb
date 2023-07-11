SUMMARY = "A DNS proxy server"
DESCRIPTION = "A DNS proxy server that supports numerous protocols, including \
DNS-over-TLS, DNS-over-HTTPS, DNSCrypt, and DNS-over-QUIC. Moreover, \
it can work as a DNS-over-HTTPS, DNS-over-TLS or DNS-over-QUIC \
server."
LICENSE = "Apache-2.0"

PV = "0.50.2"

RPM_NAME = "dnsproxy-0.50.2-1.1.aarch64.rpm"
RPM_HASH = "b95a963827a25af298b4146452dade6ed7f4974fc6d66e7afa023687991d42aa8b38eabd0c59a4cb5a644527daf076b8d9e8a46510bf58bdc3ba0cb68c11a9e6"

RPROVIDES:${PN} += "dnsproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
