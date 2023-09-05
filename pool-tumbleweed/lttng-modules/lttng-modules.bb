SUMMARY = "Licensing information for package lttng-modules"
DESCRIPTION = "This package provides licensing documentation for the lttng kmp packages."
LICENSE = "GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "2.13.9"

RPM_NAME = "lttng-modules-2.13.9-1.15.aarch64.rpm"
RPM_HASH = "ec760cac40eaf7786ac4540297c66762a3f79d74e2b5e269f6ed90820d61120db250b58753ea260c26b7e6768c9bdd83e2161e0042925cd8e5283bb9aa327bc5"

RPROVIDES:${PN} += "lttng-modules"

RDEPENDS:${PN} += ""

inherit rpm
