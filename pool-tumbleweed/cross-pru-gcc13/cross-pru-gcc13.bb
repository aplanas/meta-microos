SUMMARY = "The GNU Compiler Collection targeting pru"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting pru."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-pru-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "2122f10a3a5d02abbd376a480ca9a61ba601009cc5496d296bae8ad8f8c249b66c2676cbdb9bf37a1ba230c059d78b8dde3ed8028748db56aa12a5e8ea3a1d5a"

RPROVIDES:${PN} += "cross-pru-gcc13 \
pru-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-pru-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
