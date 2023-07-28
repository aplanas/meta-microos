SUMMARY = "The openQA documentation"
DESCRIPTION = "Documentation material covering installation, configuration, basic test writing, etc. \
Covering both openQA and also os-autoinst test engine."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689360748.edd4aa1"

RPM_NAME = "openQA-doc-4.6.1689360748.edd4aa1-1.1.aarch64.rpm"
RPM_HASH = "eff4f390c7e0f01254fb15402d4184d2db9222dc203a49acee2de62e41ee89cb72cca2b2c2369b5f1348a6e38411d8688629f8542bd0598d09bb384a24b70883"

RPROVIDES:${PN} += "openQA-doc"

RDEPENDS:${PN} += ""

inherit rpm
