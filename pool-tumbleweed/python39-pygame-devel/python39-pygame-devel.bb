SUMMARY = "Pygame development package"
DESCRIPTION = "This package contains the header files for developers of Pygame."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.0"

RPM_NAME = "python39-pygame-devel-2.5.0-1.1.aarch64.rpm"
RPM_HASH = "b339bfe2c39c9a339a7cc3f204a69bc5fc797317fcb429aa07de2e082217051806e4fe884afb75a07db4f28d7396f5c6a646f6529671e31a1ebefc6cf173128c"

RPROVIDES:${PN} += "python39-pygame-devel"

RDEPENDS:${PN} += "python39-pygame"

inherit rpm
