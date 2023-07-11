SUMMARY = "Firmware required to run the Armada80x0McBin"
DESCRIPTION = "Firmware required to run the Armada80x0McBin"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-Armada80x0McBin-0.0~20230118T162833~201514e6-2.3.aarch64.rpm"
RPM_HASH = "76989bd92ae77a94f96aa99346f0a9dae0ed6e66cf041ae80c964ba2b300c95b8d9a7cf10bb4e2353cfe431029e2109fb6fed947c9e9048d75235594c2951e7c"

RPROVIDES:${PN} += "edk2-Armada80x0McBin"

RDEPENDS:${PN} += ""

inherit rpm
