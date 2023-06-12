SUMMARY = "The GNU Compiler Collection targeting pru"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting pru."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-pru-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "e5dd7f16a671cae25601a5030f697b358ab7af8ef21053b5cbee90fe1fd53297834d516e7d7dc274596ef8395c4a4a15f507814bfd01531cd5d60846682e2b0a"

RPROVIDES:${PN} += "cross-pru-gcc12 \
cross-pru-gcc12(aarch-64) \
pru-gcc"
RDEPENDS:${PN} += "/bin/sh \
cross-pru-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
