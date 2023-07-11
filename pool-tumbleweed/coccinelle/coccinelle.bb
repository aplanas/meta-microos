SUMMARY = "Semantic patch utility"
DESCRIPTION = "Coccinelle is a program matching and transformation engine which \
provides the language SmPL (Semantic Patch Language) for specifying \
desired matches and transformations in C code. [It does not recognize \
C++.] \
 \
Coccinelle performs collateral evolutions in software. Such \
evolutions comprise the changes that are needed in client code in \
response to evolutions in library APIs, and may include modifications \
such as renaming a function, adding a function argument whose value \
is somehow context-dependent, and reorganizing a data structure. \
Beyond collateral evolutions, Coccinelle is used for finding and \
fixing bugs in systems code."
LICENSE = "GPL-2.0-only"

PV = "1.1.1"

RPM_NAME = "coccinelle-1.1.1-3.4.aarch64.rpm"
RPM_HASH = "4468487bbd975e7b1482dbd101315c21e2bf1adcff41443db387516cb200c09f727b6fbc19a5e57afe6b7480cf16aba775d9e63e4d2eb939b968235ee641604a"

RPROVIDES:${PN} += "coccinelle"

RDEPENDS:${PN} += "/usr/bin/bash \
findutils \
grep \
libc.so.6 \
libm.so.6 \
libpcre.so.1 \
python-abi \
python3-base \
which"

inherit rpm
