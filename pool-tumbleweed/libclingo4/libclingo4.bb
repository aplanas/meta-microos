SUMMARY = "Libraries file(s) for clingo"
DESCRIPTION = "Clingo is part of the Potassco project for Answer Set Programming \
(ASP). This package include clingo libraries."
LICENSE = "MIT"

PV = "5.6.2"

RPM_NAME = "libclingo4-5.6.2-2.1.aarch64.rpm"
RPM_HASH = "d16af8ac0bfe33bb71059916d486f0fcb33fd74e6f14bb72cbe840d71ec9bf9ce1f9256fa028a621fbd9f9c452e8e2be11870aea06569095b25348299d130b93"

RPROVIDES:${PN} += "libclingo.so.4 \
libclingo4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
