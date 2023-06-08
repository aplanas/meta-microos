SUMMARY = "Freepascal Compiler examples"
DESCRIPTION = "The fpc-examples package contains examples for Freepascal."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "fpc-examples-3.2.2-3.9.noarch.rpm"
RPM_HASH = "d5fc001e18ed6cef9160682cfb09380140dee0d46544d8a8394a11aa372e87c9a1213432e2be8c995cb66a1923c259fa6423b3b75248956093852d67b9f358ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fpc-examples"
RDEPENDS:${PN} += ""

inherit rpm
