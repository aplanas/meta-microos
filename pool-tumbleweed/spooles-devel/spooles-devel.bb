SUMMARY = "Header files for the SPOOLES library"
DESCRIPTION = "spooles-devel provides the header file for the SPOOLES library."
LICENSE = "BSD-2-Clause & SUSE-Public-Domain"

PV = "2.2"

RPM_NAME = "spooles-devel-2.2-1.4.aarch64.rpm"
RPM_HASH = "4da8893c7863fc0bdbc7d42bda82f72aca681397802aa580da42e51e21897ade55bc5e13b22b9ff0347a8290037a6be6d899c2882c689b9e2ea9c3cd8e1d93bf"

RPROVIDES:${PN} += "spooles-devel"

RDEPENDS:${PN} += "libspooles2-2"

inherit rpm
