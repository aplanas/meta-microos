SUMMARY = "Development files for the KLatexFormula tool library"
DESCRIPTION = "A C++/Qt4 library containing general-purpose GUI tools. \
 \
These tools were originially written for use by klatexformula, but they have \
been promoted to a library for use in any application. \
 \
This package contains the needed files for development."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "klftools-devel-4.1.0-1.14.aarch64.rpm"
RPM_HASH = "3cb64606252707738e1c5e1d83841b4682370b6a695792ef8e2a24abce939c6bd29c5b4c7ce2eb72b9e5544e91ed1065ccecdae674532d9f3c05c8ebb4f7ebaa"

RPROVIDES:${PN} += "klatexformula-devel \
klftools-devel \
libklftools-devel"

RDEPENDS:${PN} += "libklftools"

inherit rpm
