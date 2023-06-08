SUMMARY = "GNU/Linux Desktop featuring a traditional layout -- GSchemas"
DESCRIPTION = "This package provides GSettings schemas for \
Cinnamon Desktop Environment."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "5.2.7"

RPM_NAME = "cinnamon-gschemas-5.2.7-2.7.aarch64.rpm"
RPM_HASH = "f4420647de9f0faa6579b203b2196cdbec5c2da948fff86f5bea4ed4d0d295e4f86353dfaed8e38c1137bbaa43902993366b39ac6f14b60fa32bb5b01721aa21"

RPROVIDES:${PN} += "cinnamon-gschemas cinnamon-gschemas(aarch-64)"
RDEPENDS:${PN} += "cinnamon-gschemas-branding"

inherit rpm
