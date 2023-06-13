SUMMARY = "Example code for using the library"
DESCRIPTION = "GtkDatabox is a widget for the Gtk+-3 library designed to display large \
amounts of numerical data fast and easy. \
This package contains some example code for developing using GTKDataBox."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "gtkdatabox-devel-examples-1.0.0-1.10.aarch64.rpm"
RPM_HASH = "d0d86a62aca0da004c43565bae1a3f345efa8d74232d1b0fe829b8ee90cce100269c52037249d047a14cb207c2b0ae71a2464a8eb060a0a2bf66fa2eb2151eb9"

RPROVIDES:${PN} += "gtkdatabox-devel-examples \
gtkdatabox-devel-examples(aarch-64)"

RDEPENDS:${PN} += "gtkdatabox-devel"

inherit rpm
