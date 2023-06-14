SUMMARY = "Specific build system for the aqbanking universe"
DESCRIPTION = "Gwenbuild is a lightweight and fast build system tailored for the \
aqbanking universe."
LICENSE = "LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "gwenhywfar-gwenbuild-5.10.1-1.4.aarch64.rpm"
RPM_HASH = "1bbf9e87b2f58fb3774b2a8977b9d51437d473769421f4f64a174bbb88336038b9dd41917e776d6a7c88b6820ba978abee6a8ea3dfd3d4a9ab802db9309e61e6"

RPROVIDES:${PN} += "gwenhywfar-gwenbuild"

RDEPENDS:${PN} += "gwenhywfar-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgwenhywfar.so.79"

inherit rpm
