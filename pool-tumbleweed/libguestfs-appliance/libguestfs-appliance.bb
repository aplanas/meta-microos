SUMMARY = "Virtual machine needed for libguestfs"
DESCRIPTION = "libguestfs-appliance provides the appliance used by libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-appliance-1.50.1-3.3.aarch64.rpm"
RPM_HASH = "9d9c0fc13cf8e2b28be5e534cd173f88614fbefc6a4f28c403410916a7a8555ad19a2ad2f2a2eb24be76b90072909aea9a677cd6b3c5a4f8a9e6c8fe21c590d8"

RPROVIDES:${PN} += "guestfs-data \
libguestfs-appliance"

RDEPENDS:${PN} += "augeas \
augeas-lenses \
libaugeas0 \
libcap2 \
libguestfs0 \
libhivex0 \
libpcre1 \
qemu-tools"

inherit rpm
