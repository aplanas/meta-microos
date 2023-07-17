SUMMARY = "The openQA documentation"
DESCRIPTION = "Documentation material covering installation, configuration, basic test writing, etc. \
Covering both openQA and also os-autoinst test engine."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689162874.c51d4b9"

RPM_NAME = "openQA-doc-4.6.1689162874.c51d4b9-1.1.aarch64.rpm"
RPM_HASH = "84b7ff49b0ede95a37fa7f529419e1c1c1c1f50d56ca21323745baeb88838d9397830a195deeaf83e61537096c56533706f8dbb394d012739984170a2e9c031e"

RPROVIDES:${PN} += "openQA-doc"

RDEPENDS:${PN} += ""

inherit rpm
