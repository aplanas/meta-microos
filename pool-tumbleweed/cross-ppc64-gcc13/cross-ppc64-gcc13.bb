SUMMARY = "The GNU Compiler Collection targeting ppc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-ppc64-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "26c9a4a82ed05bedd9bc6ee1e28ed56c4073ad4efd3725351db931611e085b240aedbbcf9169c40d78c6e2ba4ad1b5445ab4cd3fc3e8bdb77ff6b89a028acc82"

RPROVIDES:${PN} += "cross-ppc64-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-ppc64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
