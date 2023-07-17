SUMMARY = "The GNU Compiler Collection targeting sparc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-sparc64-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "c5727dca61f9528bc28632810a7593cb42545518ef5a4fbd788b9adce2197552f1ec72701c2524c765b54b59139011cc1ff85e93ef2cfdc6b228d34a5c3cadc6"

RPROVIDES:${PN} += "cross-sparc64-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-sparc64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
