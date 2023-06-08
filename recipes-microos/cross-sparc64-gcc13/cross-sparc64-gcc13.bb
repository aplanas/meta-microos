SUMMARY = "The GNU Compiler Collection targeting sparc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-sparc64-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "b7febd63c96d051a8f493dd9513e9eb637499f196a7965b67601a42710d13e69977067ab8a0769de4c00f4a900b99f3e96c5a561af652695b133a984b79e9798"

RPROVIDES:${PN} += "cross-sparc64-gcc13 cross-sparc64-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-sparc64-binutils libstdc++6-devel-gcc13 update-alternatives"

inherit rpm
