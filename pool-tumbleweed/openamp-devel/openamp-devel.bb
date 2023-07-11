SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "BSD-3-Clause"

PV = "2020.01"

RPM_NAME = "openamp-devel-2020.01-1.13.aarch64.rpm"
RPM_HASH = "d0bc9fbf0ca23cb6f63041080b750f3ea01dc077db77c123b5ad315afc53eb00b7e73067901d11f1e66265a07a3a63a3e493536836fa6be85229369e960de105"

RPROVIDES:${PN} += "openamp-devel"

RDEPENDS:${PN} += "libopen-amp0"

inherit rpm
