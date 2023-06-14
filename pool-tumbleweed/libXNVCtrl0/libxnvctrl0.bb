SUMMARY = "NV-CONTROL X extension library"
DESCRIPTION = "The NV-CONTROL X extension provides a mechanism for X clients to query \
and set configuration parameters of the NVIDIA X driver. \
State set by the NV-CONTROL X extension is assumed to be persistent \
only for the current server generation."
LICENSE = "MIT"

PV = "510.47.03"

RPM_NAME = "libXNVCtrl0-510.47.03-1.3.aarch64.rpm"
RPM_HASH = "d53e1753be032a5174324192af01cc804c69884e5e3d7fea85dc1acb23a134426fea860ee9157909d0bff3796f02ff2747fecff68e6ab46578bd849fcc051218"

RPROVIDES:${PN} += "libXNVCtrl.so.0 \
libXNVCtrl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
