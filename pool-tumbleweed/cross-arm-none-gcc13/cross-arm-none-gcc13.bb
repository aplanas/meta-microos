SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-arm-none-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "78853e58d2af2f37b7847522932b95ac24174eb7f45f8751bbdc5055bfa54ab69167bd8b62a34505d2429e028b87735797e6d3f6995fc261cbd8d4ccee3e86a5"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
