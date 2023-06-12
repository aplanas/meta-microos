SUMMARY = "Headers for fastjet-contrib"
DESCRIPTION = "This package provides the headers for writing code using fastjet-contrib."
LICENSE = "GPL-2.0-only"

PV = "1.049"

RPM_NAME = "fastjet-contrib-devel-1.049-1.3.aarch64.rpm"
RPM_HASH = "bd24bace72a424a0ec07d8355fabd22a2bdb6c2114d1b66168fec7636aee88a0a39fec3811972702d92c5b3af5e09da5f854d5986f134ee1663a8e1573939b8a"

RPROVIDES:${PN} += "fastjet-contrib-devel \
fastjet-contrib-devel(aarch-64)"
RDEPENDS:${PN} += "libfastjetcontribfragile"

inherit rpm
