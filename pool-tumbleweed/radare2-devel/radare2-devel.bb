SUMMARY = "Devel files for radare2"
DESCRIPTION = "Development files for radare2"
LICENSE = "LGPL-3.0-only"

PV = "5.8.6"

RPM_NAME = "radare2-devel-5.8.6-1.1.aarch64.rpm"
RPM_HASH = "fe918c1d42fc93efd8e439f23692d15bb94f4fc6b8b24ba6bc3167c545bc14081261f0387ed422876ae7626f8691cd0fee79eea91929f67b4e3e17f0d1d526ab"

RPROVIDES:${PN} += "pkgconfig-libr \
pkgconfig-r-anal \
pkgconfig-r-arch \
pkgconfig-r-asm \
pkgconfig-r-bin \
pkgconfig-r-bp \
pkgconfig-r-config \
pkgconfig-r-cons \
pkgconfig-r-core \
pkgconfig-r-crypto \
pkgconfig-r-debug \
pkgconfig-r-egg \
pkgconfig-r-esil \
pkgconfig-r-flag \
pkgconfig-r-fs \
pkgconfig-r-io \
pkgconfig-r-lang \
pkgconfig-r-magic \
pkgconfig-r-main \
pkgconfig-r-reg \
pkgconfig-r-search \
pkgconfig-r-socket \
pkgconfig-r-syscall \
pkgconfig-r-util \
radare2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
file-devel \
pkgconfig-capstone \
pkgconfig-libxxhash \
pkgconfig-libzip \
pkgconfig-openssl \
pkgconfig-r-anal \
pkgconfig-r-arch \
pkgconfig-r-asm \
pkgconfig-r-bin \
pkgconfig-r-bp \
pkgconfig-r-config \
pkgconfig-r-cons \
pkgconfig-r-core \
pkgconfig-r-crypto \
pkgconfig-r-debug \
pkgconfig-r-egg \
pkgconfig-r-esil \
pkgconfig-r-flag \
pkgconfig-r-fs \
pkgconfig-r-io \
pkgconfig-r-lang \
pkgconfig-r-magic \
pkgconfig-r-reg \
pkgconfig-r-search \
pkgconfig-r-socket \
pkgconfig-r-syscall \
pkgconfig-r-util \
pkgconfig-zlib \
radare2"

inherit rpm
