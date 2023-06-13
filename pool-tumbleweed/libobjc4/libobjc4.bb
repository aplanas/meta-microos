SUMMARY = "Library for the GNU Objective C Compiler"
DESCRIPTION = "The library for the GNU Objective C compiler."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "13.1.1+git7364"

RPM_NAME = "libobjc4-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "94261470c9d6aebef215b2f622ea42d0a361ee4db3a1c3bd3c4c27c328dc5e9daafbe3aa29268fea3f7b87155fc0da1a2bc2b57d72eb72bff393672e45753cb7"

RPROVIDES:${PN} += "libobjc.so.4()(64bit) \
libobjc4 \
libobjc4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit)"

inherit rpm
