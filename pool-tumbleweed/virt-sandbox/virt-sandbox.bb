SUMMARY = "Libvirt application sandbox framework"
DESCRIPTION = "The virt-sandbox package provides an API for building application \
sandboxes using libvirt. Sandboxes can be based on either container \
or machine based virtualization technology. Also included is a simple \
command line tool for launching sandboxes for arbitrary commands."
LICENSE = "LGPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "virt-sandbox-0.8.0-5.4.aarch64.rpm"
RPM_HASH = "988fe8a8772d9a7d84483f9f6edcda9c9507f36786f92a4b64608cc67a565df594921ae66725fbeb7fb63c9cfc4ceb957e24f4e03ba4b7a29a1364b9324e48a3"

RPROVIDES:${PN} += "virt-sandbox"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvirt-client \
libvirt-gobject-1.0.so.0 \
libvirt-sandbox-1-0-5 \
libvirt-sandbox-1.0.so.5 \
python3-gobject"

inherit rpm
