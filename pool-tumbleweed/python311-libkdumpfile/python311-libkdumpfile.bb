SUMMARY = "Python interface for libkdumpfile"
DESCRIPTION = " \
 \
 \
 \
 \
This package contains all necessary python modules to use libkdumpfile via \
the Python interpreter."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.1+git3.g97c716a"

RPM_NAME = "python311-libkdumpfile-0.5.1+git3.g97c716a-3.2.aarch64.rpm"
RPM_HASH = "d3059a5d261a249774232f363a464d548f1a2000103750c18e92de317c94d25d0d06d51669d764c39ad075455c69e35169b93082f81bf99b9f3a5bfd26fd73a1"

RPROVIDES:${PN} += "python3-libkdumpfile \
python3.11dist-libkdumpfile \
python311-libkdumpfile \
python3dist-libkdumpfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaddrxlat.so.3 \
libc.so.6 \
libkdumpfile.so.10 \
python-abi"

inherit rpm
