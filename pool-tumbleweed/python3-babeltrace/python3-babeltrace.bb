SUMMARY = "Python Bindings for babeltrace"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
Python Bindings for the babeltrace package."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.5.8"

RPM_NAME = "python3-babeltrace-1.5.8-3.8.aarch64.rpm"
RPM_HASH = "e87ae3da93b7b389d6d806efdfe5d6d3c171216fdf096cd8fcf8d080e1d69d39c297456ca682201c3e87cfcc3317738a8b7f89aaf834c5c2d0f12ef1777002a7"

RPROVIDES:${PN} += "python3-babeltrace \
python3.11dist-babeltrace \
python3dist-babeltrace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbabeltrace-ctf.so.1 \
libbabeltrace.so.1 \
libc.so.6 \
python-abi"

inherit rpm
