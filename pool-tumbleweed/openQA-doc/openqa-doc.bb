SUMMARY = "The openQA documentation"
DESCRIPTION = "Documentation material covering installation, configuration, basic test writing, etc. \
Covering both openQA and also os-autoinst test engine."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1693565748.f367431"

RPM_NAME = "openQA-doc-4.6.1693565748.f367431-1.1.aarch64.rpm"
RPM_HASH = "bc4a525d6de241ad431c5ff5c1f29e63a7a23e576f8a20d91ef5b7d146130d6aecbd1e9bb6a050a44a4d75f5ce2afee687567707886209962a0089126d70468f"

RPROVIDES:${PN} += "openQA-doc"

RDEPENDS:${PN} += ""

inherit rpm
