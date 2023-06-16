SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.9"

RPM_NAME = "guile-devel-3.0.9-1.1.aarch64.rpm"
RPM_HASH = "94107494dac9e62952f933513ee57a3c688af8f2cb9587bd579d38ac42e645c383199e525ee2c71295e6d5d13e9cabcf6b7591bb38b16d6b60acbdc22437ee42"

RPROVIDES:${PN} += "guile-devel \
pkgconfig-guile-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
gmp-devel \
guile \
libffi-devel \
libguile-3-0-1 \
libunistring-devel \
ncurses-devel \
pkgconfig-bdw-gc \
readline-devel"

inherit rpm
