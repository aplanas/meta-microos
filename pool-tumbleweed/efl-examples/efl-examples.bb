SUMMARY = "Examples of EFL usage"
DESCRIPTION = "Examples usage of the EFL library."
LICENSE = "BSD-2-Clause & LGPL-2.1-only & Zlib"

PV = "1.26.3"

RPM_NAME = "efl-examples-1.26.3-30.8.aarch64.rpm"
RPM_HASH = "dd5e654e566dd98bf9c3d400807df9a35bd306fe37380b95e6ba5dbbe2bb5e0683b5bced05406713db321db2c5cda187ef7f460a538d91e828089705f5f17797"

RPROVIDES:${PN} += "efl-examples"

RDEPENDS:${PN} += ""

inherit rpm
