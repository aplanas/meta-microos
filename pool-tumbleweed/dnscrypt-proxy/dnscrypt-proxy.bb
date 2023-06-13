SUMMARY = "A tool for securing communications between a client and a DNS resolver"
DESCRIPTION = "A flexible DNS proxy, with support for modern encrypted DNS protocols \
such as DNSCrypt v2, DNS-over-HTTPS, Anonymized DNSCrypt \
and ODoH (Oblivious DoH)."
LICENSE = "ISC"

PV = "2.1.4"

RPM_NAME = "dnscrypt-proxy-2.1.4-1.4.aarch64.rpm"
RPM_HASH = "7f66c23085bc9e3e159c125d7bb465f95bbb14b552fc42d538a6ef356e672f789db4390ab975c4233c9f589e344a891741d242a0582085a3b2e130dc0ef3b1d4"

RPROVIDES:${PN} += "config(dnscrypt-proxy) \
dnscrypt \
dnscrypt-proxy \
dnscrypt-proxy(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
bash \
libc.so.6()(64bit) \
shadow \
systemd"

inherit rpm
