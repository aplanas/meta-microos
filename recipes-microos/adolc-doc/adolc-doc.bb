SUMMARY = "Algorithmic Differentiation Library for C/C++ -- documentation"
DESCRIPTION = "This package provides the user's manual for ADOL-C."
LICENSE = "EPL-1.0 | GPL-2.0-or-later"

PV = "2.7.2"

RPM_NAME = "adolc-doc-2.7.2-2.3.noarch.rpm"
RPM_HASH = "64bca7a4a7148efbe568907af9b87fea129166f32f054ec72cd458510fc3606853de67ae75e4769a8edc5356ae4f1a7c598a3949d570d43e7a7298edb539aa06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adolc-doc"
RDEPENDS:${PN} += ""

inherit rpm
