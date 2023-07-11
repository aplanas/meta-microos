SUMMARY = "Development files for the KLatexFormula backend library"
DESCRIPTION = "A C++/Qt library to generate images (PNG, EPS, PDF, plus all Qt-supported image \
formats) from LaTeX equations. \
 \
This library implements the base functionality of KLatexFormula. \
 \
This package contains the needed files for development. \
 \
See also packages klatexformula-devel and libklfbackend-qt3-devel"
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "klfbackend-devel-4.1.0-1.14.aarch64.rpm"
RPM_HASH = "ae10df6b140a8588268538d8133e52751c476e1d3aea1b443b582970337dd44b2b084195e520aa73e7955d29003c7d712b08abc85545d8f97987ac80a714a278"

RPROVIDES:${PN} += "klfbackend-devel \
libklfbackend-devel"

RDEPENDS:${PN} += "libklfbackend"

inherit rpm
