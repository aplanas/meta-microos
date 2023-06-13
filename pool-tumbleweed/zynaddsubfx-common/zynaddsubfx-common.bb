SUMMARY = "Common files for ZynAddSubFX synthesizers"
DESCRIPTION = "zynaddsubfx is a many-featured real-time software synthesizer for \
Linux.	Features include polyphony and multitimbrel and microtonal \
capabilities. It includes randomness of some parameters, which can make \
warm sounds, like analog synthesizers.	This program has system and \
insertion effects, too. \
 \
These are files common to the gui and dssi,lv2 and vst plugins."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.6"

RPM_NAME = "zynaddsubfx-common-3.0.6-3.1.noarch.rpm"
RPM_HASH = "071ad3a684209d0ccd3b975751534089e37e0a5a412e2595c5530dee31d391205549306549e5023f4ebaafc4c8571da786bbd37ff5072e8e2d262afbee80852e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ZynAddSubFX-common \
zynaddsubfx-common"

RDEPENDS:${PN} += ""

inherit rpm
