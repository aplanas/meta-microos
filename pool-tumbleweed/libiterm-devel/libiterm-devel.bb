SUMMARY = "Header files and development libraries for libiterm"
DESCRIPTION = "Header files and development libraries for libiterm"
LICENSE = "SUSE-CPL-0.5"

PV = "0.5.20040304"

RPM_NAME = "libiterm-devel-0.5.20040304-301.9.aarch64.rpm"
RPM_HASH = "32705db81d60cd85136f32f46a964d9f16d318c206f2a24a626243d7e21f3f8703dea3316106745c5fdeca583b9df51857559d353c3e69e3822eac824e67fa52"

RPROVIDES:${PN} += "libiterm-devel"

RDEPENDS:${PN} += "libiterm1"

inherit rpm
