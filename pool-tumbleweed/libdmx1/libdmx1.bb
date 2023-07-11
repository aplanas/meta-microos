SUMMARY = "Distributed Multihead X extension library"
DESCRIPTION = "libdmx is an interface to the DMX extension for X, which allows a \
single server to be set up as a proxy spanning multiple servers -- \
not unlike Xinerama across discrete physical machines. It can be \
reconfigured on the fly to change the layout, and it is presented as \
a single logical display to clients. \
 \
libdmx allows clients to configure the layout of DMX servers by \
adding and removing screens, input devices, et al."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "libdmx1-1.1.5-1.1.aarch64.rpm"
RPM_HASH = "326ba89aaced2c02cbf84fc4c163f51006d6227bf3b037b1c2a9dad571217a34f372f7c7c6db82c39d115c3a6785e7220361eb2fa2c21f7174097e19911b9ccc"

RPROVIDES:${PN} += "libdmx.so.1 \
libdmx1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
