SUMMARY = "Simple font dumper"
DESCRIPTION = "Simple font dumper \
This tool is part of the FreeType project"
LICENSE = "FTL & GPL-2.0-only"

PV = "2.13.0"

RPM_NAME = "ftdump-2.13.0-4.1.aarch64.rpm"
RPM_HASH = "5bd094b71fb6929e20ed1f343385d4881e456eb2bb0f1f0b57f7812aace7b669dc55a7bdbfc6c583079003ddf355ece4f55a3907b07dbe6ebc204e1a40c0a966"

RPROVIDES:${PN} += "ftdump \
ftdump(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit)"

inherit rpm
