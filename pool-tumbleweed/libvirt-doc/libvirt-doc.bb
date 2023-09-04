SUMMARY = "API reference and website documentation for libvirt"
DESCRIPTION = "The API reference for the libvirt C library, and a \
copy of the libvirt.org website documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-doc-9.6.0-2.1.noarch.rpm"
RPM_HASH = "2c4f43b176538de851aa80606ba62c453c53f1a4e784d652d4d4cc33db29e7785e9049344ceae725690d89b8f85b30357de02796785798ff6d650b6d0a58ec06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libvirt-doc"

RDEPENDS:${PN} += ""

inherit rpm
