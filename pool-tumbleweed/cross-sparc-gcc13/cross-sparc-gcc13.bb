SUMMARY = "The GNU Compiler Collection targeting sparcv9"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparcv9. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-sparc-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "35bb73ca7e3eca05a323e56ce4c0b19f8f816e7a27d5e568cdb22aa350e1389e157126f1961a2bab2b185b7f7bd627efb9b28b199802f9d92527b47cdf6ee405"

RPROVIDES:${PN} += "cross-sparc-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-sparc-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
