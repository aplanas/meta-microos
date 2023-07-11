SUMMARY = "OHIF plugin for Orthanc"
DESCRIPTION = "OHIF plugin for Orthanc \
The homepage of OHIF can be found at: \
https://ohif.org/"
LICENSE = "AGPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "orthanc-ohif-1.0-1.1.aarch64.rpm"
RPM_HASH = "1c673cdcd667d5ef73d2ace643a7e0de6bf1a93092186e74e3687b05b0855c0c75910ba71b85794fd26ea3cd6e60fb2519711936e70bea555c0250a67109e60f"

RPROVIDES:${PN} += "libOrthancOHIF.so.1.0 \
orthanc-ohif"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libstdc++.so.6 \
libz.so.1 \
orthanc"

inherit rpm
