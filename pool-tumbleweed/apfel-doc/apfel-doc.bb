SUMMARY = "Documentation for APFEL, a PDF evolution library"
DESCRIPTION = "This package provides documentation for APFEL in PDF (Portable \
Document Format), a PDF (Probability Distribution Function) evolution \
library."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.6"

RPM_NAME = "apfel-doc-3.0.6-1.17.aarch64.rpm"
RPM_HASH = "63c7694ab607cdd8c09d801ec6c59c944e657a0a47003fe5b5ae6eb7ddac8aab4cad223deb32180c7e9908d6d75ad31c6fe077d5994ed0d6ef2fefba01f5d22c"

RPROVIDES:${PN} += "apfel-doc \
apfel-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
