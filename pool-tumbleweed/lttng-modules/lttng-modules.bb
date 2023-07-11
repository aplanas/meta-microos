SUMMARY = "Licensing information for package lttng-modules"
DESCRIPTION = "This package provides licensing documentation for the lttng kmp packages."
LICENSE = "GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "2.13.9"

RPM_NAME = "lttng-modules-2.13.9-1.7.aarch64.rpm"
RPM_HASH = "8ecc5d9b7375884ef2cd6947ee2f349e098025e881d8cc3b51abac0749393e182dd493f96620bda5f789482303f3298f1436a85f974626fe38fb214247913bca"

RPROVIDES:${PN} += "lttng-modules"

RDEPENDS:${PN} += ""

inherit rpm
