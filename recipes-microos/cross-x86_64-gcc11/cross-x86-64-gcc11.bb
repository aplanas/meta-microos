SUMMARY = "The GNU Compiler Collection targeting x86_64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting x86_64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-x86_64-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "209f4f0c505fd296a900439e1cf582dc8c6879adc4c2c41c2792144fe74b6f4ee9118cf547276cd6ed7208dd74a87d4d1eb32ca1acaa354d155e5cdd94582cf2"

RPROVIDES:${PN} += "cross-x86_64-gcc11 cross-x86_64-gcc11(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-x86_64-binutils libstdc++6-devel-gcc11 update-alternatives"

inherit rpm
