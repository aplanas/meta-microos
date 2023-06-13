SUMMARY = "Tools to work with PDF files"
DESCRIPTION = "Command line tools for working with PDF files."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.8"

RPM_NAME = "podofo-0.9.8-1.10.aarch64.rpm"
RPM_HASH = "1e702b089ade1e540a88557f0ae1e4a121c4a18d6bc5cd9b8357be0179bedbb81d4577af75f5167dffe06f9d34d878e3f54f0da6541e9662ce81bcf5240015d7"

RPROVIDES:${PN} += "podofo \
podofo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpodofo.so.0.9.8()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
