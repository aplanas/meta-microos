SUMMARY = "Development files for libprelude"
DESCRIPTION = "Libprelude is a library that guarantees secure connections between all sensors \
and the Prelude Manager. Libprelude provides an Application Programming Interface \
(API) for the communication with Prelude sub-systems, it supplies the necessary \
functionality for generating and emitting IDMEF events with Prelude and automates \
the saving and re-transmission of data in times of temporary interruption of one \
of the components of the system."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "libprelude-devel-5.2.0-2.16.aarch64.rpm"
RPM_HASH = "ce2b002c2460d4cbc8920d00b898b089970c47e44289dc6cd3b9901f0976ff12e02b05585cd2496d3dadd6d74d3bdc9cd79f0799443f63d91e2553742f804e0a"

RPROVIDES:${PN} += "libprelude-devel \
pkgconfig-libprelude"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgcrypt-devel \
libgpg-error-devel \
libprelude28 \
libpreludecpp12 \
pkgconfig-gnutls \
pkgconfig-libpcre"

inherit rpm
