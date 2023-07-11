SUMMARY = "Header files for wordcut, a Thai word segmentation utility"
DESCRIPTION = "This package contains files necessary to build against libwordcut."
LICENSE = "BSD-3-Clause"

PV = "0.5.1b2"

RPM_NAME = "wordcut-devel-0.5.1b2-206.1.aarch64.rpm"
RPM_HASH = "86f520d5eac23a2b1fc7f6f29078e4ffa2af70ae12909b56056f301c9ec121c6d607c7e123959954b9ca1299ff0c45b5661b81cf8575830c1e5d317c9ef52965"

RPROVIDES:${PN} += "pkgconfig-wordcut \
wordcut-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libwordcut0"

inherit rpm
