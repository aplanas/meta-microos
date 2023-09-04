SUMMARY = "The openQA documentation"
DESCRIPTION = "Documentation material covering installation, configuration, basic test writing, etc. \
Covering both openQA and also os-autoinst test engine."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1692951551.c933949"

RPM_NAME = "openQA-doc-4.6.1692951551.c933949-1.1.aarch64.rpm"
RPM_HASH = "3b8bd7cc6e10d61f5b9e05685934cc5de0adcba85e12929b22b00b32670aa9659bb310d1191655e54761ac6a0d476743d215061c8dc20f1077727a77f0628ea0"

RPROVIDES:${PN} += "openQA-doc"

RDEPENDS:${PN} += ""

inherit rpm
