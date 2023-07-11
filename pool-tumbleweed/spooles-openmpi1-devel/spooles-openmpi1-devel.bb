SUMMARY = "Header files for the SPOOLES library"
DESCRIPTION = "spooles-openmpi1-devel provides the header file for the SPOOLES library."
LICENSE = "BSD-2-Clause & SUSE-Public-Domain"

PV = "2.2"

RPM_NAME = "spooles-openmpi1-devel-2.2-1.5.aarch64.rpm"
RPM_HASH = "d19eaf046379412e09ec90584c8dbecf924290d21b09e44cfd9b352f63e13de50cebebab50b1b80b057ed9d12aabb12f7b974c830f613c9411710f3e17887337"

RPROVIDES:${PN} += "spooles-openmpi1-devel"

RDEPENDS:${PN} += "libspooles2-2-openmpi1"

inherit rpm
