SUMMARY = "HTML documentation for shorewall configuration"
DESCRIPTION = "HTML documentation for the Shoreline Firewall. Highly recommend to read before \
starting to configure shorewall"
LICENSE = "GFDL-1.1-only"

PV = "5.2.8"

RPM_NAME = "shorewall-docs-5.2.8-5.2.noarch.rpm"
RPM_HASH = "a85d61dfd8dd6fa68e0c3f7979553151f6240adbe190cd3553ad1eb4f82272ecf9268673a8a89c5a2710d3317e1b6825fe16d0d0b187b16f15e331bfd695a5f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shorewall-docs"

RDEPENDS:${PN} += ""

inherit rpm
