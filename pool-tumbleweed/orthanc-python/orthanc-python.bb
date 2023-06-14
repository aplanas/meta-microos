SUMMARY = "Python plugin for Orthanc"
DESCRIPTION = "This plugin can be used to write Orthanc plugins in Python instead of C++ \
See /usr/share/doc/packages/orthanc/orthanc-python-readme.openSUSE"
LICENSE = "AGPL-3.0-or-later"

PV = "4.0"

RPM_NAME = "orthanc-python-4.0-1.5.aarch64.rpm"
RPM_HASH = "20ca34ee88948b4386ac2d064b24288dc91f80d856f0465d8a8ffad442d1c610b46c7459fbfdca12cdfff6c96702ba822f6525c9589aae161d909b889d3df9ef"

RPROVIDES:${PN} += "libOrthancPython.so.4.0 \
orthanc-python"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
orthanc"

inherit rpm
