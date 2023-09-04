SUMMARY = "Development files for libprelude"
DESCRIPTION = "Libprelude is a library that guarantees secure connections between all sensors \
and the Prelude Manager. Libprelude provides an Application Programming Interface \
(API) for the communication with Prelude sub-systems, it supplies the necessary \
functionality for generating and emitting IDMEF events with Prelude and automates \
the saving and re-transmission of data in times of temporary interruption of one \
of the components of the system."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "libprelude-devel-bindings-5.2.0-2.17.aarch64.rpm"
RPM_HASH = "fd37f8ee7e3a3788a1b50915dcb6a862bbfd7231941d2e4e3aa6024819ccf3332e4e252ea9c3faf8a007891735d57d7fa9a7bf9d519e415078535ed3254b2c5b"

RPROVIDES:${PN} += "libprelude-devel-bindings"

RDEPENDS:${PN} += "libprelude-devel \
lua-devel \
python3-devel \
ruby-devel \
swig"

inherit rpm
