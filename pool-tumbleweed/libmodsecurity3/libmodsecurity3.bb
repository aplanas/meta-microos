SUMMARY = "Web application firewall engine"
DESCRIPTION = "ModSecurity is a toolkit for real-time web application monitoring, logging, and \
access control."
LICENSE = "BSD-2-Clause"

PV = "3.0.10"

RPM_NAME = "libmodsecurity3-3.0.10-1.1.aarch64.rpm"
RPM_HASH = "55965c686a4b2d6687531cde8bf526165f418433b2b75276c15bc6ca32fae2111c36c6c23159661c3961837769dbbcb689068c1c9fd3dce2b9fea788d5b85ff0"

RPROVIDES:${PN} += "libmodsecurity.so.3 \
libmodsecurity3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpcre.so.1 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
