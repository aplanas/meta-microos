SUMMARY = "MANA runtime library"
DESCRIPTION = "This package contains the mana runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libmana1-47.0-1.1.aarch64.rpm"
RPM_HASH = "61fbdd12157fb8be241b14ff0a52ceda95e3bc7d6d5031444561b11ae3b738a2bc01c4f110ba2ec5b14f1c20f59e6d222daf115235a232bbcd2e71bb96ef2faa"

RPROVIDES:${PN} += "libmana.so.1 \
libmana1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
