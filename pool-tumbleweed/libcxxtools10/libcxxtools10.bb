SUMMARY = "Collection of General-purpose C++ Classes"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools10-3.0-4.5.aarch64.rpm"
RPM_HASH = "50d89a0c598ad1dff14d4057f2963a8fe4ba1f0a19d4f2b626f8181be4b27ebb8ca9ead792f696e24636c0221cb066307d002fd1758017293c3eb93826fa330e"

RPROVIDES:${PN} += "libcxxtools.so.10 \
libcxxtools10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
