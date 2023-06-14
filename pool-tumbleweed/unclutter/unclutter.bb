SUMMARY = "Remove the idle cursor image from the screen"
DESCRIPTION = "Unclutterer removes the cursor image from the screen so that it does \
not obstruct the area you are looking at after it has not moved for a \
given period of time. \
 \
 \
 \
Authors: \
-------- \
    Mark M Martin <mmm@cetia.fr> \
    Andreas Stolcke <stolcke@ICSI.Berkeley.EDU>"
LICENSE = "SUSE-Public-Domain"

PV = "8"

RPM_NAME = "unclutter-8-1066.21.aarch64.rpm"
RPM_HASH = "242327d85155c9593d31b8cbda239bfabe6b98b40d763b3afab461c9c2677070c5b713a3b1a8a18fe634a6464ad6d20ff879c0719f07d1c8c54caf2b65904a3c"

RPROVIDES:${PN} += "unclutt \
unclutter"

RDEPENDS:${PN} += "libX11.so.6 \
libc.so.6"

inherit rpm
