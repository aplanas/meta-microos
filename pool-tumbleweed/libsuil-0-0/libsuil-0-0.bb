SUMMARY = "Lightweight C library for loading and wrapping LV2 plugin UIs"
DESCRIPTION = " \
Suil is a lightweight C library for loading and wrapping LV2 plugin UIs. \
 \
Suil makes it possible to load a UI of any toolkit in a host using any \
other toolkit (assuming the toolkits are both supported by Suil). \
Hosts do not need to build against or link to foreign toolkit libraries \
to use UIs written with that toolkit (Suil performs its magic at \
runtime using dynamically loaded modules). The API is designed such that \
hosts do not need to explicitly support particular toolkits whatsoever. \
If Suil supports a particular toolkit, then all hosts that use Suil will \
support that toolkit."
LICENSE = "ISC"

PV = "0.10.18"

RPM_NAME = "libsuil-0-0-0.10.18-1.1.aarch64.rpm"
RPM_HASH = "d01e96ca6accf5cd32ca4e70160590c56311e59c4c8ebc8b2b45c28346dd8afdc8758f79411a82a88c6d2f8a72371568865bb0a5a5f4659db8e1581b1e8f4600"

RPROVIDES:${PN} += "libsuil-0-0 \
libsuil-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
