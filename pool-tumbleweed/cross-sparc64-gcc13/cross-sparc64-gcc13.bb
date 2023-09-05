SUMMARY = "The GNU Compiler Collection targeting sparc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-sparc64-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "0121c9675699a890c56dddb48a7fddcf0ec6fcdfbbde1dd0b9f02f9e60d2730249052e1e8aa996e48656b8ef1a4ae14e6c5f8581be6ef93e071e1f39c9152d0f"

RPROVIDES:${PN} += "cross-sparc64-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-sparc64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
