SUMMARY = "Python Bindings for babeltrace2"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
Python Bindings for the babeltrace2 package."
LICENSE = "MIT & GPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "python3-babeltrace2-2.0.4-1.10.aarch64.rpm"
RPM_HASH = "e2dbbdba05b2314edb89d1e6bb5600765fbdff7f1104ff8a0a1fb79a5d9b27964cfbb6598d2806db37949cb088c10bd8eda87478e76924c135b6f1f95f2726b9"

RPROVIDES:${PN} += "python3-babeltrace2 \
python3.10dist-bt2 \
python3dist-bt2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbabeltrace2.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
python-abi"

inherit rpm
