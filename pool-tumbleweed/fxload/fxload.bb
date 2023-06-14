SUMMARY = "Download Firmware into USB FX and FX2 Devices"
DESCRIPTION = "This program can download firmware into FX, FX2 and FX3 \
(thanks to the patch from Steven J. Magnani) EZ-USB devices as \
well as the original AnchorChips EZ-USB.  It is intended to be invoked \
by hotplug scripts when the unprogrammed device appears on the bus. \
 \
Primarily as an aid for developers, this can also be used to update \
firmware on devices that boot from I2C serial EEPROMs.	For that use, \
as well as downloading firmware to all other off-chip memory, a second \
stage loader must first be downloaded."
LICENSE = "LGPL-2.1-or-later"

PV = "2013_01_03"

RPM_NAME = "fxload-2013_01_03-2.2.aarch64.rpm"
RPM_HASH = "55365d46f634819e001a0693bd3f020ac8ed1f76b2cb82ef15e352313b347c6bafa1aa2e2bdb3af643e96892297c48f9521c71709e4954f14e7eec8315a88a20"

RPROVIDES:${PN} += "fxload"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
