SUMMARY = "Default overlay for warewulf"
DESCRIPTION = "Includes the default overlays so that they can be updated seprately."
LICENSE = "BSD-3-Clause"

PV = "4.4.0"

RPM_NAME = "warewulf4-overlay-4.4.0-6.5.aarch64.rpm"
RPM_HASH = "bff4d6d908d745abadbfdf24401ec9303113d311dfc6d2d9901c40598f2c816d9e412668818a7d275570e0392e82f79451fb71b8ec6c73a0632fb3a946a498ce"

RPROVIDES:${PN} += "config-warewulf4-overlay \
warewulf4-overlay"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
warewulf4"

inherit rpm
