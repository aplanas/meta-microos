SUMMARY = "Documentation for libklu"
DESCRIPTION = "Documentation for libklu."
LICENSE = "LGPL-2.1-or-later"

PV = "5.13.0"

RPM_NAME = "libklu-doc-5.13.0-49.1.aarch64.rpm"
RPM_HASH = "dc607888cf6c8f558118adb04bcf53420e667bb3828076971d638e6709f7f30c7eb197718b98c3820ebe116f1db0890b3cbe825c3acf894ccb664e6354d28286"

RPROVIDES:${PN} += "libklu-doc \
libklu-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
