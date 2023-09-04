SUMMARY = "Python Bindings for babeltrace2"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
Python Bindings for the babeltrace2 package."
LICENSE = "GPL-2.0-only & MIT"

PV = "2.0.5"

RPM_NAME = "python3-babeltrace2-2.0.5-1.1.aarch64.rpm"
RPM_HASH = "5392cded0e9f202e9cea89e2bcbc41f9df5688dfe09bab6d2a54b5c3d076931a4b023f2697fd0304c27e17756cce16ca5d6c1d6072f78c75751a3063b0673ee6"

RPROVIDES:${PN} += "python3-babeltrace2 \
python3.11dist-bt2 \
python3dist-bt2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbabeltrace2.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
python-abi"

inherit rpm
