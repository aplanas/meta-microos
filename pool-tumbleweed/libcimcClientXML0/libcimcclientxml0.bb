SUMMARY = "Small Footprint CIM Client Library"
DESCRIPTION = "Small Footprint CIM Client Library (sfcc) Runtime Libraries"
LICENSE = "EPL-1.0"

PV = "2.2.9~rc1"

RPM_NAME = "libcimcClientXML0-2.2.9~rc1-1.1.aarch64.rpm"
RPM_HASH = "6734bcc467e308eecaff02767334c14670aed8292e026ed2c1c5a74b7512f9a5eb82a0af52026170b075db3d7ab33859d4aa299577b174dfe9812f1fed32fcae"

RPROVIDES:${PN} += "libcimcClientXML.so.0 \
libcimcClientXML0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4"

inherit rpm
