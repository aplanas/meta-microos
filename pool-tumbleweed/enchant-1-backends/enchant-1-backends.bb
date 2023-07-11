SUMMARY = "ISpell/Myspell backends for libenchant"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries. \
 \
This package provides the ispell and myspell backends."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-backends-1.6.1-6.4.aarch64.rpm"
RPM_HASH = "238c3ee65dc129d7b87c12d2a22dd3860fcba3f4aa6d200504597d84526be9aded7cf1a40327c0e89a255de5a50b01c56924539594034a06d5801d0d800164b6"

RPROVIDES:${PN} += "enchant-1-backend \
enchant-1-backends \
libenchant-ispell.so \
libenchant-myspell.so \
libenchant1-/usr/lib64/enchant/libenchant-ispell.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
