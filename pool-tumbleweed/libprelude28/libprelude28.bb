SUMMARY = "Prelude Libraries"
DESCRIPTION = "Libprelude is a library that guarantees secure connections between all sensors \
and the Prelude Manager. Libprelude provides an Application Programming Interface \
(API) for the communication with Prelude sub-systems, it supplies the necessary \
functionality for generating and emitting IDMEF events with Prelude and automates \
the saving and re-transmission of data in times of temporary interruption of one \
of the components of the system."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "libprelude28-5.2.0-2.17.aarch64.rpm"
RPM_HASH = "5b3c33af9364ce739440bcaff87f88351726fd78a64da9111acde6efdea17832af09798de02d2af7f2a03bca9441558f9507575b226b0bd27e2bff0d568e5a03"

RPROVIDES:${PN} += "libprelude.so.28 \
libprelude28"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libpcre.so.1"

inherit rpm
