SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-s390x-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "f89563db0c96b64be6fcc297be13671958e09b140fa4c56f6acf81b9aeedc0224acb94eb90fd80d6bf669fb0c72b6fe1a7081d961032b799cbb4760cf0b5d11f"

RPROVIDES:${PN} += "cross-s390x-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-s390x-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
