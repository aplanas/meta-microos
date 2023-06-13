SUMMARY = "SSL/SSH multiplexer"
DESCRIPTION = "sslh lets one accept both HTTPS and SSH connections on the same port. It makes \
it possible to connect to an SSH server on port 443 (e.g. from inside a \
corporate firewall) while still serving HTTPS on that port."
LICENSE = "GPL-2.0-or-later"

PV = "1.22c"

RPM_NAME = "sslh-1.22c-2.4.aarch64.rpm"
RPM_HASH = "c7c6fa3a14a15f70d36975755d60c0adeb5226390fc0bd468e798d0aa0bd7f53466dc9ee9cbe47b9358074fd9489805f8ee52f0bd43c76bb89c5346b6257ce0e"

RPROVIDES:${PN} += "config(sslh) \
sslh \
sslh(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
group(nobody) \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libconfig.so.11()(64bit) \
libpcre2-8.so.0()(64bit) \
openssh \
openssl \
systemd"

inherit rpm
