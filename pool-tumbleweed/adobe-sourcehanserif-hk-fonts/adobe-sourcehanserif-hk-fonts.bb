SUMMARY = "Source Han Serif HK"
DESCRIPTION = "Source Han Serif is an open source Pan-CJK typeface whose OpenType/CFF fonts and CID-based sources are covered under the terms of the SIL Open Font License, Version 1.1."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "adobe-sourcehanserif-hk-fonts-2.001-1.3.noarch.rpm"
RPM_HASH = "7588d6f3c7826df2ded24a4368ecb6d0b17ceb9b17e80df10dd71e5a2fc213d41c37027fb589e23f4b3fa8f0355326451a57f32ce85bb44505aa09757310dd1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehanserif-hk-fonts \
locale-zh-HK \
scalable-font-zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
