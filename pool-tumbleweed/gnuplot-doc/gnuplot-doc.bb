SUMMARY = "Documentation of GNUplot"
DESCRIPTION = "GNUplot is a command line driven interactive function plotting utility. \
GNUplot supports many different types of terminals, plotters, and \
printers (including many color devices and pseudodevices like LaTeX) \
and can easily be extended to include new devices. \
 \
 \
gnuplot documentation files including the info pages."
LICENSE = "GPL-2.0-or-later & SUSE-Gnuplot"

PV = "5.4.7"

RPM_NAME = "gnuplot-doc-5.4.7-1.1.noarch.rpm"
RPM_HASH = "469a9e28584c07f665b702bd71e825d73b6dbe04d11c86e268d843d08580d1b4b2aba76746f402f0a75d8c4a73052f6e806249acfc36eee3cf055dc825d1bf2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuplot-doc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnuplot"

inherit rpm
