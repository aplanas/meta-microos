SUMMARY = "The GNU Compiler Collection targeting arm"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-arm-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "1737f8eef0121d40b05c63c33f21360786b504134dfda9757a6fbc1651c19e958921fe8cbd6175b1562754856e28cec00c0f0a5cfb6c4956868b55978bae8fb7"

RPROVIDES:${PN} += "cross-arm-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
