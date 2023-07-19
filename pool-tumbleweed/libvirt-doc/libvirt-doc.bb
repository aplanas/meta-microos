SUMMARY = "API reference and website documentation for libvirt"
DESCRIPTION = "The API reference for the libvirt C library, and a \
copy of the libvirt.org website documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-doc-9.5.0-1.1.noarch.rpm"
RPM_HASH = "68d27a3997f1db001a247211fd18956923d4176766b59387591474cd9c96c78e94c795758566142462fd05258161adca24e0b43bf3f33ffa7b22410ebed4459a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libvirt-doc"

RDEPENDS:${PN} += ""

inherit rpm
