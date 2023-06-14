SUMMARY = "XFCE Desktop Environment"
DESCRIPTION = "Xfce is a lightweight desktop environment for various *NIX systems."
LICENSE = "MIT"

PV = "20230212"

RPM_NAME = "patterns-xfce-xfce-20230212-2.1.aarch64.rpm"
RPM_HASH = "1186a6d6c6069a146219aa0e75507545bda29aaa6d826a1577e5668930c1bce7584822d4e0588c3b21c18d90c40af809b158e802b0644055d01e52a96952f97d"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-openSUSE-xfce \
patterns-xfce-xfce"

RDEPENDS:${PN} += "pattern-"

inherit rpm
