SUMMARY = "Development files for libprelude"
DESCRIPTION = "Libprelude is a library that guarantees secure connections between all sensors \
and the Prelude Manager. Libprelude provides an Application Programming Interface \
(API) for the communication with Prelude sub-systems, it supplies the necessary \
functionality for generating and emitting IDMEF events with Prelude and automates \
the saving and re-transmission of data in times of temporary interruption of one \
of the components of the system."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "libprelude-devel-bindings-5.2.0-2.14.aarch64.rpm"
RPM_HASH = "dfde0be84def54f7125d8d6f86d68278462e7aa44a4a8d4c041bf3d78bfb5ccb370985aba34716264f0ca34a400b8a548ae2a4c39e7101d8fe724991d93c0ff1"

RPROVIDES:${PN} += "libprelude-devel-bindings"

RDEPENDS:${PN} += "libprelude-devel \
lua-devel \
python3-devel \
ruby-devel \
swig"

inherit rpm
