SUMMARY = "Header files for the sympol library"
DESCRIPTION = "SymPol is a C++ tool to work with symmetric polyhedra. \
This package contains the header files for using the sympol library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.9"

RPM_NAME = "sympol-devel-0.1.9-1.11.aarch64.rpm"
RPM_HASH = "3fab2245de118e79b20f1bc3d6c1dc2e969b995d24815c8ec89dd9808d0ceadba4f9126f97df22dcd06e8b92fa33bafaae3853215d109cd61da40ea633277956"

RPROVIDES:${PN} += "sympol-devel"

RDEPENDS:${PN} += "libsympol0-1 \
permlib-devel"

inherit rpm
