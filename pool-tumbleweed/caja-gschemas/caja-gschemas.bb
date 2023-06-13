SUMMARY = "Caja GSchemas"
DESCRIPTION = "Caja is the official file manager for the MATE desktop. It allows to \
browse directories, preview files and launch applications associated \
with them. It is also responsible for handling the icons on the MATE \
desktop. It works on local and remote filesystems. \
 \
This package provides the GSettings schemas for Caja."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "caja-gschemas-1.26.1-1.4.aarch64.rpm"
RPM_HASH = "4623d2605e7f9f39c3b2714dca2bdee8cc67c3e6c575a386719591af824b7f9a504f469250851c3a1439d92fd64819e25c623b7cd93eb6be6e1fa03c8e9ac243"

RPROVIDES:${PN} += "caja-gschemas \
caja-gschemas(aarch-64) \
caja-gsettings-schemas"

RDEPENDS:${PN} += ""

inherit rpm
