SUMMARY = "Development files for libprelude"
DESCRIPTION = "Libprelude is a library that guarantees secure connections between all sensors \
and the Prelude Manager. Libprelude provides an Application Programming Interface \
(API) for the communication with Prelude sub-systems, it supplies the necessary \
functionality for generating and emitting IDMEF events with Prelude and automates \
the saving and re-transmission of data in times of temporary interruption of one \
of the components of the system."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "libprelude-devel-bindings-5.2.0-2.16.aarch64.rpm"
RPM_HASH = "2c491c9c15ab7d06ed1b6be582c8054c438ed7464215e9e3cbe24c32f6683bae1278f2fc9fd8d7e3a9737c78a2449982828cc5c968cf9ef5c4c5d14b29d1c0f0"

RPROVIDES:${PN} += "libprelude-devel-bindings"

RDEPENDS:${PN} += "libprelude-devel \
lua-devel \
python3-devel \
ruby-devel \
swig"

inherit rpm
