SUMMARY = "Development files for the KLatexFormula tool library"
DESCRIPTION = "A C++/Qt4 library containing general-purpose GUI tools. \
 \
These tools were originially written for use by klatexformula, but they have \
been promoted to a library for use in any application. \
 \
This package contains the needed files for development."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "klftools-devel-4.1.0-1.13.aarch64.rpm"
RPM_HASH = "f04e7426467bf2967585f818bf2253c882e89fd6a12409ba92b19cea74fe61e11897119fa5691c6dc3ade98dcbe4482bf82898dcc86286e7311c196117b96c62"

RPROVIDES:${PN} += "klatexformula-devel \
klftools-devel \
klftools-devel(aarch-64) \
libklftools-devel"

RDEPENDS:${PN} += "libklftools"

inherit rpm
