SUMMARY = "Tutorial for Nifty Erik's Windowing Toolkit"
DESCRIPTION = "This package contains a tutorial about the Newt windowing toolkit. \
 \
Newt is a programming library for color text-mode, widget-based user \
interfaces.  Newt can be used to add stacked windows, entry widgets, \
check boxes, radio buttons, labels, plain text fields, scrollbars, \
etc., to text mode user interfaces. Newt is based on the slang library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.52.23"

RPM_NAME = "newt-doc-0.52.23-2.1.noarch.rpm"
RPM_HASH = "ef3dd8ee8a5193d8e58549ff82309ea8f8e5b3628ff3e0ff9d5a1d09a8c335a8255c880c74f8089717202989c79ac1cd8b415551a9b8e1622bb50b500f080aaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "newt-doc"

RDEPENDS:${PN} += ""

inherit rpm
