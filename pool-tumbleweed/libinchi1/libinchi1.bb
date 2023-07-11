SUMMARY = "The IUPAC International Chemical Identifier library"
DESCRIPTION = "The IUPAC International Chemical Identifier (InChI) is a non-proprietary \
identifier for chemical substances that can be used in printed and \
electronic data sources thus enabling easier linking of diverse data \
compilations. It was developed under IUPAC Project 2000-025-1-800 during \
the period 2000-2004. Details of the project and the history of its \
progress are available from the project web site. \
 \
This package contains the InChi shared library."
LICENSE = "LGPL-2.0-or-later"

PV = "1.06"

RPM_NAME = "libinchi1-1.06-2.4.aarch64.rpm"
RPM_HASH = "39409bf8ff5383e1fad0a907576b5057fa75a0d209749aa97caff382afb87db79424d8c76e49aab15a77cbf9cc93b9d041734ec9ccf489985d524d51e0f1f6a0"

RPROVIDES:${PN} += "libinchi.so.1 \
libinchi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
