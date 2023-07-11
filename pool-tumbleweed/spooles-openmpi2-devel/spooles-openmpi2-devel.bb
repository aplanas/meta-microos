SUMMARY = "Header files for the SPOOLES library"
DESCRIPTION = "spooles-openmpi2-devel provides the header file for the SPOOLES library."
LICENSE = "BSD-2-Clause & SUSE-Public-Domain"

PV = "2.2"

RPM_NAME = "spooles-openmpi2-devel-2.2-1.5.aarch64.rpm"
RPM_HASH = "522a10e02dfd213743137187f25784d9c7f13b52abd33fce4221c39249f122002f75ae1a50dd76ae5f55cc389ada5ec6e24f9d20020d314ccfec2cd7191f2b63"

RPROVIDES:${PN} += "spooles-openmpi2-devel"

RDEPENDS:${PN} += "libspooles2-2-openmpi2"

inherit rpm
