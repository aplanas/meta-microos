SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cpp13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "4fd0652fcdc60f76b5d24334b33e9da7d450cb617a2cecb024ca6277c2e77f8084e42d1f73c02e83ca4e942ced0aab002f7b34f59557c075529156c369bc90a2"

RPROVIDES:${PN} += "cpp13"

RDEPENDS:${PN} += "libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
