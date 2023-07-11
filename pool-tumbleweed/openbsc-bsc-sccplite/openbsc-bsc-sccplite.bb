SUMMARY = "GSM Base Station Controller"
DESCRIPTION = "This is the BSC-only version of OpenBSC. It requires a Mobile Switching Center \
(MSC) to operate. \
 \
You might rather prefer to use openbsc (osmo-nitb) which is considered a \
'GSM Network-in-a-Box' and does not depend on a MSC."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "openbsc-bsc-sccplite-1.4.1-1.11.aarch64.rpm"
RPM_HASH = "d8241ed31b67d1d29876e35870aa1d8805b91df3079de7d0f85742e4822db749f7a16939b50cbaae4259c75cc31fa0be68bd227ffd8c5a0876f03c3ae951b37a"

RPROVIDES:${PN} += "config-openbsc-bsc-sccplite \
openbsc-bsc-sccplite"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libosmocore.so.20 \
libosmonetif.so.11 \
libosmovty.so.9 \
libtalloc.so.2"

inherit rpm
