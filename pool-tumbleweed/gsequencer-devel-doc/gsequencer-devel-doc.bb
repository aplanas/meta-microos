SUMMARY = "Documentation for Advanced Gtk+ Sequencer"
DESCRIPTION = "Advanced Gtk+ Sequencer library development documentation."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "6.0.1"

RPM_NAME = "gsequencer-devel-doc-6.0.1-1.1.noarch.rpm"
RPM_HASH = "f148a776f3ff21b9422ab0c1f1f2551aa5bf66fcdf3bc2bb42fde7c076cb50d02a9ac5873e6ca63011d946384c0be303afa0f6dd85c2263123334223d9f18f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsequencer-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
