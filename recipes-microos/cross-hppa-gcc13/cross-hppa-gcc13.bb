SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-hppa-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "240efda5588ab01983d3b0960e1d3a829095baee4874cf791c3ffa5886410c4e3f8b1519d3db889d9f69cf3ae32485e954742d7775c00af4aa133c4702d34aa5"

RPROVIDES:${PN} += "cross-hppa-gcc13 cross-hppa-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-hppa-binutils libstdc++6-devel-gcc13 update-alternatives"

inherit rpm
