SUMMARY = "Development Libraries and Header Files for Free kWnn"
DESCRIPTION = "This package contains the header files and libraries for building \
client programs that use the Korean Input System, Free kWnn."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "fkwnn-devel-1.1.1a023.1-4.4.aarch64.rpm"
RPM_HASH = "8d82616c688e73d9c6c3c29a39086b42c12ec9ceae5af7d91058d5ec3d4d54ebbd24b1d53869149c93d1e4860ec74be5624f4126a22c9af51b8aa2b83098d8e4"

RPROVIDES:${PN} += "fkwnn-devel \
fwknndev"

RDEPENDS:${PN} += "fcwnn-devel \
fkwnn"

inherit rpm
