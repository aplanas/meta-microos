SUMMARY = "Generate command-line completions using a simple DSL"
DESCRIPTION = " \
Generate tab completion for any shell command by specifying its usage in a familiar manpage-like format."
LICENSE = "MIT"

PV = "1.0+git.20220402.ec8fccc"

RPM_NAME = "compleat-1.0+git.20220402.ec8fccc-1.9.aarch64.rpm"
RPM_HASH = "c982b9563160c318540d7e2d4ee637850198d3a9daa6e29e2d9e9ebf39777e951140e21dedf598adaea385d174bec4c949c1453ec288520977c78ef9f09cf343"

RPROVIDES:${PN} += "compleat"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
