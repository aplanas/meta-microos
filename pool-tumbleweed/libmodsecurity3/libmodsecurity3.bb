SUMMARY = "Web application firewall engine"
DESCRIPTION = "ModSecurity is a toolkit for real-time web application monitoring, logging, and \
access control."
LICENSE = "BSD-2-Clause"

PV = "3.0.9"

RPM_NAME = "libmodsecurity3-3.0.9-1.2.aarch64.rpm"
RPM_HASH = "2c605f1b0c81c7f51c1b5b644cac8afd2141c73b754c50d968165a9767e7044335422969908bd4ae779dab41200440488c3d7495fcfd3aec8870609ace01c3ca"

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
