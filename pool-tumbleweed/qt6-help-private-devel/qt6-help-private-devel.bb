SUMMARY = "Non-ABI stable API for the Qt 6 Help library"
DESCRIPTION = "This package provides private headers of libQt6Help that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-help-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "77029290e78edfa9a3c59587effda583643c7836fec84cf592bae38d68096401d399f2893ce23100d91be83802ece62a151772c161612727c372c559f0946238"

RPROVIDES:${PN} += "qt6-help-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Help \
qt6-core-private-devel"

inherit rpm
