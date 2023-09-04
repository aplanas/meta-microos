SUMMARY = "A tool for securing communications between a client and a DNS resolver"
DESCRIPTION = "A flexible DNS proxy, with support for modern encrypted DNS protocols \
such as DNSCrypt v2, DNS-over-HTTPS, Anonymized DNSCrypt \
and ODoH (Oblivious DoH)."
LICENSE = "ISC"

PV = "2.1.5"

RPM_NAME = "dnscrypt-proxy-2.1.5-1.1.aarch64.rpm"
RPM_HASH = "83dce3c5df6d30989e65c5d06142f31610c9a5349e48402a5ed4c4d9d1e2951fe4a0aa2f469efc6dc8ac0b4828dd520199521d369337a2984f6d93b214076c39"

RPROVIDES:${PN} += "config-dnscrypt-proxy \
dnscrypt \
dnscrypt-proxy"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
bash \
libc.so.6 \
shadow \
systemd"

inherit rpm
