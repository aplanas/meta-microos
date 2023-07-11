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

RPM_NAME = "zynaddsubfx-common-3.0.6-3.2.noarch.rpm"
RPM_HASH = "1af18c5e976ab565bf017f6089c975909daf4045e86076d7a5588e28e05f41e86a5959cffee5f5e1027a7714e6aaa937b190a6611e4d162d50ff2d3bab7d379f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ZynAddSubFX-common \
zynaddsubfx-common"

RDEPENDS:${PN} += ""

inherit rpm
