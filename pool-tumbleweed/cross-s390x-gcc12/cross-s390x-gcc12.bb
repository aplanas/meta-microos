SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-s390x-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "79be43c31c06037548b4229982f34cc7293da08fa6f1504831f50e15b32c70b78495f45558419374df431fe9e72f9a4525892f0fd07d9371b230ab4d642d9276"

RPROVIDES:${PN} += "cross-s390x-gcc12"

RDEPENDS:${PN} += "/bin/sh \
cross-s390x-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
