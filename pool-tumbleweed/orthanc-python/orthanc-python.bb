SUMMARY = "Python plugin for Orthanc"
DESCRIPTION = "This plugin can be used to write Orthanc plugins in Python instead of C++ \
See /usr/share/doc/packages/orthanc/orthanc-python-readme.openSUSE"
LICENSE = "AGPL-3.0-or-later"

PV = "4.0"

RPM_NAME = "orthanc-python-4.0-1.6.aarch64.rpm"
RPM_HASH = "37b27ff6692d4043e60165956a57a5218096bcfe229c9d7a91f52b177591ae4ca8b7ff24ae3973376613daa9617c9e043774e01f864ec2aaec5211dbc89b1287"

RPROVIDES:${PN} += "libOrthancPython.so.4.0 \
orthanc-python"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
orthanc"

inherit rpm
