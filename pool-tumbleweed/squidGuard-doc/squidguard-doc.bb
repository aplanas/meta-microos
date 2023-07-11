SUMMARY = "Documentation and examples for squidGuard"
DESCRIPTION = "This package contains documentation for SquidGuard, a filter, redirector, \
and access controller plugin for squid."
LICENSE = "GPL-2.0-only"

PV = "1.6.0"

RPM_NAME = "squidGuard-doc-1.6.0-1.15.aarch64.rpm"
RPM_HASH = "9de0c7cd86f1eb502eb2443efc4bf47e5682f1302e366a99722a089cdb9bb359396696c13c322fd6cb019dd1f71bb3747e73f1cd4a5c5e229d37a838631c403a"

RPROVIDES:${PN} += "squidGuard-doc"

RDEPENDS:${PN} += ""

inherit rpm
