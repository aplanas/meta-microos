SUMMARY = "Glade catalog for Anjuta"
DESCRIPTION = "Anjuta is a versatile Integrated Development Environment (IDE) for the \
GNOME desktop. \
 \
This package provides a catalog for Glade, to allow the use the Anjuta \
widgets in Glade."
LICENSE = "GPL-2.0-or-later"

PV = "3.34.0"

RPM_NAME = "glade-catalog-anjuta-3.34.0-5.8.aarch64.rpm"
RPM_HASH = "289a9c0c1950f92d03933017ce8b618ffc97d682f07da48304d17f633bc06716f501a7a7d151f45925694ad27369926721fd45c1ed713683804399f5685364de"

RPROVIDES:${PN} += "glade-catalog-anjuta \
libgladeanjuta.so"

RDEPENDS:${PN} += "anjuta \
glade"

inherit rpm
