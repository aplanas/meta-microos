SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-ppc64le-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "5fa67a989865f6bbb0a229c199da39d023184a60cfad9fe7d29aecfa51f3588450344e7441792a042218b6abf8e3b9f86ea3184c46f9693cd13fe6c297e5edc3"

RPROVIDES:${PN} += "cross-ppc64le-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-ppc64le-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
