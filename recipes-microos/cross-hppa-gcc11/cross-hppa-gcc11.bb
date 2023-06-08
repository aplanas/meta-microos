SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-hppa-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "19d2ca915fe7b309222b412dad4b1dd7ac67fa45e1fb3b6a85fa00cf621a0b51d025c384e43ad50958c9565880ec3ffd1d9ad62a3fd70663e80af41f076fb36b"

RPROVIDES:${PN} += "cross-hppa-gcc11 cross-hppa-gcc11(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-hppa-binutils libstdc++6-devel-gcc11 update-alternatives"

inherit rpm
