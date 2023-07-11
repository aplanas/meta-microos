SUMMARY = "SSL/SSH multiplexer"
DESCRIPTION = "sslh lets one accept both HTTPS and SSH connections on the same port. It makes \
it possible to connect to an SSH server on port 443 (e.g. from inside a \
corporate firewall) while still serving HTTPS on that port."
LICENSE = "GPL-2.0-or-later"

PV = "1.22c"

RPM_NAME = "sslh-1.22c-2.5.aarch64.rpm"
RPM_HASH = "4b2d4cc3a16c478265e59545881e818ed201cc709bc07873d49e27594de6b5a8f8b915c154459b3bb53f2d48d170d041d236b3281012bdd0c005ee0e30267beb"

RPROVIDES:${PN} += "config-sslh \
sslh"

RDEPENDS:${PN} += "/usr/bin/sh \
group-nobody \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.11 \
libpcre2-8.so.0 \
openssh \
openssl \
systemd"

inherit rpm
