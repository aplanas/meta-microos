SUMMARY = "Development files for libprelude"
DESCRIPTION = "Libprelude is a library that guarantees secure connections between all sensors \
and the Prelude Manager. Libprelude provides an Application Programming Interface \
(API) for the communication with Prelude sub-systems, it supplies the necessary \
functionality for generating and emitting IDMEF events with Prelude and automates \
the saving and re-transmission of data in times of temporary interruption of one \
of the components of the system."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "libprelude-devel-5.2.0-2.17.aarch64.rpm"
RPM_HASH = "d47be2ce94bd861ef3551e5be1361f7bf84a458cd02b62e0e6ec39c22aa22c385627a9507de7bc6e14f661a1d9d7a986501c679756637b810585152da65ae321"

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
