SUMMARY = "Reciprocating engine for X"
DESCRIPTION = "Xengine displays a reciprocating engine in a window and is a benchmark \
for X."
LICENSE = "ISC"

PV = "1.11"

RPM_NAME = "xengine-1.11-1117.26.aarch64.rpm"
RPM_HASH = "59c89503beeefaf55e3ee6ffd52bdd5edf04027d8518335d81e6f5c38ada3b3a6545cc29672ac092929e851609675fe2e3b0824cef73d784c3e5c4e6c9ea5e74"

RPROVIDES:${PN} += "xengine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
