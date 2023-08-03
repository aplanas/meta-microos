SUMMARY = "API reference and website documentation for libvirt"
DESCRIPTION = "The API reference for the libvirt C library, and a \
copy of the libvirt.org website documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-doc-9.5.0-2.1.noarch.rpm"
RPM_HASH = "221405eabc82343f60766a68e94a8085987043e344cd92802f3e9580d2a1895bd3977ffa672468c11bc58ec42ba8596894f7de2df2a8dd9fc92950ad4f904633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libvirt-doc"

RDEPENDS:${PN} += ""

inherit rpm
