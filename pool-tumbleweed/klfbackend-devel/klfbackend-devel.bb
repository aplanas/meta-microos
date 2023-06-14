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

RPM_NAME = "klfbackend-devel-4.1.0-1.13.aarch64.rpm"
RPM_HASH = "2932364dbe775b91d4ebc57c832c5b181008af04d77af10b4cb072bde70f38f685de91ed5e22ec1121a2a979ea8d72298ca7f891a1ad851fffb13da1b219a642"

RPROVIDES:${PN} += "klfbackend-devel \
libklfbackend-devel"

RDEPENDS:${PN} += "libklfbackend"

inherit rpm
