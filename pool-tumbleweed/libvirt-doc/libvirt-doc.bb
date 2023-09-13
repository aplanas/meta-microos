SUMMARY = "API reference and website documentation for libvirt"
DESCRIPTION = "The API reference for the libvirt C library, and a \
copy of the libvirt.org website documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-doc-9.7.0-1.1.noarch.rpm"
RPM_HASH = "1ab01fa2dc3adc3416151808c9be6ea8b3435b5c57fa03ed2b35ecae638d21fa8dd9b3fa24fad59e9c5960145c7617d8720103b6b401913b9e5ad23a35e04b34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libvirt-doc"

RDEPENDS:${PN} += ""

inherit rpm
