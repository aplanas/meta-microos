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

RPM_NAME = "newt-static-0.52.23-2.2.aarch64.rpm"
RPM_HASH = "b3b97140f58d1e09db390b396ca263703641616b9d6d8926025083885dbe0ed12df31f67864ed7b9058738bba049f37fe2ce5d5af9a222c736412e32594cca14"

RPROVIDES:${PN} += "newt-static"

RDEPENDS:${PN} += "newt-devel"

inherit rpm
