SUMMARY = "The GNU Compiler Collection targeting sparcv9"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparcv9. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-sparc-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "f1850486eea5d704f896a794424a286cfe82247f98965101bb0cdd21bcd783e69920bc7510bf14d6bd93dd6393aaed8b5fcbfd11b9d80a38bd1a53082f842143"

RPROVIDES:${PN} += "cross-sparc-gcc13 cross-sparc-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-sparc-binutils libstdc++6-devel-gcc13 update-alternatives"

inherit rpm
