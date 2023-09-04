SUMMARY = "Maildir indexer and searcher"
DESCRIPTION = "Set of utilities to index and search Maildirs. Upstream name is mu."
LICENSE = "GPL-3.0-or-later"

PV = "1.10.6"

RPM_NAME = "maildir-utils-1.10.6-1.1.aarch64.rpm"
RPM_HASH = "af64cb897a292a1ea187cbd8d07af2425bb2f276d0102bedb9bd58bd2d6f409bd88dbf223f869910d9e3d6c45f86286948fbadfee73aa6d1472d283ab486cc68"

RPROVIDES:${PN} += "maildir-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libxapian.so.30"

inherit rpm
