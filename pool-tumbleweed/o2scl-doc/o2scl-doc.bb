SUMMARY = "Documentation for o2scl"
DESCRIPTION = "O2scl is a C++ library for object-oriented numerical programming. \
This package provides the documentation for o2scl."
LICENSE = "GPL-3.0-only"

PV = "0.926"

RPM_NAME = "o2scl-doc-0.926-3.5.aarch64.rpm"
RPM_HASH = "db798ccdc88f075c367fcc57a740dd33a9b94cf3db2545f44e8bbedfe086672bb15f06a448c1bcc7ae7e1267fe7c6d4d09a34119a605fe5901770a83fe39959c"

RPROVIDES:${PN} += "o2scl-doc"

RDEPENDS:${PN} += ""

inherit rpm
