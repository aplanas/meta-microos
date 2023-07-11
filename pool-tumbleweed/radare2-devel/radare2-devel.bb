SUMMARY = "Devel files for radare2"
DESCRIPTION = "Development files for radare2"
LICENSE = "LGPL-3.0-only"

PV = "5.8.6"

RPM_NAME = "radare2-devel-5.8.6-1.2.aarch64.rpm"
RPM_HASH = "1cb81e746dbf431cdcf0cf33520cc9d01987ee1a3c4603411d0a56753c10b4676b739c3f4b9206567917a7fe2f921cdff35f1578d181e526fc9fec5e425a1c28"

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
