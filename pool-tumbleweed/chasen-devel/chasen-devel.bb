SUMMARY = "Libraries and header files for ChaSen developers"
DESCRIPTION = "Libraries and header files for ChaSen developers."
LICENSE = "BSD-3-Clause"

PV = "2.4.5"

RPM_NAME = "chasen-devel-2.4.5-2.13.aarch64.rpm"
RPM_HASH = "ea838e3c41cb8ff9af6798373ba2442403a73e832c4b40482286f57a8fd37187ff4f81bccc47253b176c5d9c5759da2e1029147a9a48d8a2a59296c3baac8460"

RPROVIDES:${PN} += "chasen-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
chasen"

inherit rpm
