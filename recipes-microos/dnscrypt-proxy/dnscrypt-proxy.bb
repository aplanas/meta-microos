SUMMARY = "A tool for securing communications between a client and a DNS resolver"
DESCRIPTION = "A flexible DNS proxy, with support for modern encrypted DNS protocols \
such as DNSCrypt v2, DNS-over-HTTPS, Anonymized DNSCrypt \
and ODoH (Oblivious DoH)."
LICENSE = "ISC"

PV = "2.1.4"

RPM_NAME = "dnscrypt-proxy-2.1.4-1.3.aarch64.rpm"
RPM_HASH = "4cfae829ca83b10e6e87c05ae01f44c20ffdf7c794ef95210efc011eb128b86ff1fce7e25de96ce43536ec9b072aa2e5052485380a5c39f429ab57a6ed1c44af"

RPROVIDES:${PN} += "config(dnscrypt-proxy) dnscrypt dnscrypt-proxy dnscrypt-proxy(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 bash libc.so.6(GLIBC_2.34)(64bit) shadow systemd"

inherit rpm
