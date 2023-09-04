SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-avr-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "ec0b89b16100027103ea4000ac93ca4a127e7fe2aa0a379c0fc4b73515758052fe25f828a375905dabc1b2e114472a05a3f942d245cabba4444427c4eaaf0019"

RPROVIDES:${PN} += "cross-avr-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-avr-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
