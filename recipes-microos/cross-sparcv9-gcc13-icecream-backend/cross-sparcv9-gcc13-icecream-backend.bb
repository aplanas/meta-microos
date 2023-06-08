SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-sparcv9-gcc13-icecream-backend-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "d515e7924e912a22dffe0329163bf58c0755b0b7bdd37855a7c0f4082aa77610701a15952d28e7b1e2dffd92d843ebc78441e154ff1bb008ea63a5d5c30ab03e"

RPROVIDES:${PN} += "cross-sparcv9-gcc13-icecream-backend cross-sparcv9-gcc13-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
