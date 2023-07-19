SUMMARY = "The openQA documentation"
DESCRIPTION = "Documentation material covering installation, configuration, basic test writing, etc. \
Covering both openQA and also os-autoinst test engine."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689265095.7be7504"

RPM_NAME = "openQA-doc-4.6.1689265095.7be7504-1.1.aarch64.rpm"
RPM_HASH = "e42de2b1054bfa21f0d36ebdcbeb19834f48c564a48ea1799c18ec909291305ed64201b9ed0b65fc836d0a62e8226c15047d240e8405201a5aa4c0f070347510"

RPROVIDES:${PN} += "openQA-doc"

RDEPENDS:${PN} += ""

inherit rpm
