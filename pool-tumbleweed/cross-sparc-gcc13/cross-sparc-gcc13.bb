SUMMARY = "The GNU Compiler Collection targeting sparcv9"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparcv9. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-sparc-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "b02af1e5589baf418d82361833a3aba263ee1441f64de4254632200206165e92527043b34bec9d7faa6949ef0d4f3738caba1e0976643b53042a3c30e512dcab"

RPROVIDES:${PN} += "cross-sparc-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-sparc-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
