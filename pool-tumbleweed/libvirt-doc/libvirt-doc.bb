SUMMARY = "API reference and website documentation for libvirt"
DESCRIPTION = "The API reference for the libvirt C library, and a \
copy of the libvirt.org website documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-doc-9.4.0-3.1.noarch.rpm"
RPM_HASH = "4152877e783aabad6b0657047c1555c224ab2e93ac81b24bbd90fc0605435f26c04b180074abc8d20f2d9c191a0ab7315a29eb075f87ff50897f98d1907f7fc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libvirt-doc"

RDEPENDS:${PN} += ""

inherit rpm
