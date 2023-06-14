SUMMARY = "Static libraries of Nifty Erik's Windowing Toolkit"
DESCRIPTION = "This package contains the static libraries needed to compile programs \
based on newt which don't need the shared libraries. Install it if you \
need to link statically with libnewt. \
 \
Newt is a programming library for color text-mode widget-based user \
interfaces.  Newt can be used to add stacked windows, entry widgets, \
check boxes, radio buttons, labels, plain text fields, scrollbars, \
etc., to text mode user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.52.23"

RPM_NAME = "newt-static-0.52.23-2.1.aarch64.rpm"
RPM_HASH = "bc3a70836ff603014537dff95c92bdbd404a3cc0ce2023d119f9af181af1772f766b57a5b65d8347689fbb463f7ab16f64ce0ace11cca36f7058e06726f0e336"

RPROVIDES:${PN} += "newt-static"

RDEPENDS:${PN} += "newt-devel"

inherit rpm
