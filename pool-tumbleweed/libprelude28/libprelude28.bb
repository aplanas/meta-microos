SUMMARY = "Prelude Libraries"
DESCRIPTION = "Libprelude is a library that guarantees secure connections between all sensors \
and the Prelude Manager. Libprelude provides an Application Programming Interface \
(API) for the communication with Prelude sub-systems, it supplies the necessary \
functionality for generating and emitting IDMEF events with Prelude and automates \
the saving and re-transmission of data in times of temporary interruption of one \
of the components of the system."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "libprelude28-5.2.0-2.14.aarch64.rpm"
RPM_HASH = "8afca83369bde001f7cc25f99cafebcc7bff7c3f95a9853fc93c462e92821b394dd980f683def8b5aeb85d0954dd27a331e61833358d6f3cc8b6f1af8c10f674"

RPROVIDES:${PN} += "libprelude.so.28 \
libprelude28"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libpcre.so.1"

inherit rpm
