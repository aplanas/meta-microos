SUMMARY = "Python Bindings for babeltrace"
DESCRIPTION = "This project provides trace read and write libraries, as well as a \
trace converter. A plugin can be created for any trace format to \
allow its conversion to/from another trace format. \
 \
Python Bindings for the babeltrace package."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.5.8"

RPM_NAME = "python3-babeltrace-1.5.8-3.7.aarch64.rpm"
RPM_HASH = "803417149dd34f0fd0c8529237b8d089daaffb07696f755093099555fd6e12651825771565bab2ddf6c6310b13886e63ca77de656bf28a79372957079c9b5714"

RPROVIDES:${PN} += "python3-babeltrace \
python3-babeltrace(aarch-64) \
python3.10dist(babeltrace) \
python3dist(babeltrace)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbabeltrace-ctf.so.1()(64bit) \
libbabeltrace.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
