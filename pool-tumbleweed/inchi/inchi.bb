SUMMARY = "The IUPAC International Chemical Identifier"
DESCRIPTION = "The IUPAC International Chemical Identifier (InChI) is a non-proprietary \
identifier for chemical substances that can be used in printed and \
electronic data sources thus enabling easier linking of diverse data \
compilations. It was developed under IUPAC Project 2000-025-1-800 during \
the period 2000-2004. Details of the project and the history of its \
progress are available from the project web site. \
 \
This package contains the command line conversion utility."
LICENSE = "LGPL-2.0-or-later"

PV = "1.06"

RPM_NAME = "inchi-1.06-2.4.aarch64.rpm"
RPM_HASH = "93f78482d9146f6db2b26563e9c2ab8bfd26a62b149f1e80a915ba17667577ebac1ebb745109bcfaf84a868fedf481a23a1fc5ac8e571f5a53311aaf5329a92f"

RPROVIDES:${PN} += "inchi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
