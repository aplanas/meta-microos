SUMMARY = "Library to allow communication between libnfsidmap and SSSD"
DESCRIPTION = "A utility library to allow communication between libnfsidmap and SSSD."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "libnfsidmap-sss-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "b301b6773a131d592abdef373bb12702a895bf3c502713889192e3b2e6874dfca5acafaaabc544086c880e85d47f96ae3a8b05a8983b76e5ff13978f443af5b3"

RPROVIDES:${PN} += "libnfsidmap-sss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnfsidmap.so.1"

inherit rpm
