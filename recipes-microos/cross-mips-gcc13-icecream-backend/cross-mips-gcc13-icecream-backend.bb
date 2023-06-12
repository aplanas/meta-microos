SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-mips-gcc13-icecream-backend-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "c1a2bd642f8c86b861803df16fe16ea3727275f230842b86a0ca28bfdb08e0d44540c339ebf1a257aa2062b7435b1c9f940b79672ebbc97aafc1783f5a4cdb25"

RPROVIDES:${PN} += "cross-mips-gcc13-icecream-backend cross-mips-gcc13-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
