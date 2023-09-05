SUMMARY = "API reference and website documentation for libvirt"
DESCRIPTION = "The API reference for the libvirt C library, and a \
copy of the libvirt.org website documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-doc-9.6.0-3.1.noarch.rpm"
RPM_HASH = "00b0310da566b0e56999e60103a840cd0fa4abca575994e950c5edfe58f02c877dbf2d155b9a53b32ffadb1821c6668d2a3d66404567687fbf5b4f6f73dbaacf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libvirt-doc"

RDEPENDS:${PN} += ""

inherit rpm
