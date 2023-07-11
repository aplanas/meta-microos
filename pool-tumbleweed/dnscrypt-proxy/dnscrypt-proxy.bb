SUMMARY = "A tool for securing communications between a client and a DNS resolver"
DESCRIPTION = "A flexible DNS proxy, with support for modern encrypted DNS protocols \
such as DNSCrypt v2, DNS-over-HTTPS, Anonymized DNSCrypt \
and ODoH (Oblivious DoH)."
LICENSE = "ISC"

PV = "2.1.4"

RPM_NAME = "dnscrypt-proxy-2.1.4-1.5.aarch64.rpm"
RPM_HASH = "a992cf56617690dd4628a19b1c1b824f8e0f3b7e59e95e1a55d51ad0a9598eeb54720fd4608d1bc9c46f8b1d59d394b45743ba309fd1b486796ec467c20e13dd"

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
