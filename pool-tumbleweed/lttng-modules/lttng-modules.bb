SUMMARY = "Licensing information for package lttng-modules"
DESCRIPTION = "This package provides licensing documentation for the lttng kmp packages."
LICENSE = "GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "2.13.9"

RPM_NAME = "lttng-modules-2.13.9-1.11.aarch64.rpm"
RPM_HASH = "57486409ecec96dc75b1e0637c901e76ca8c9811429a5e88d9c698074de2154b3faab7ba2fb15acf84e854243d3a2cdea3c99ca0d315ee2a91b7a0542638f20d"

RPROVIDES:${PN} += "lttng-modules"

RDEPENDS:${PN} += ""

inherit rpm
