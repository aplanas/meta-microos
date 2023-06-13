SUMMARY = "Python plugin support for trace-cmd"
DESCRIPTION = "Python plugin support for trace-cmd"
LICENSE = "GPL-2.0-only"

PV = "3.1.6"

RPM_NAME = "trace-cmd-python3-3.1.6-1.3.aarch64.rpm"
RPM_HASH = "6861660214c178a4e3aa4d404a4399e52cc2687ad4e94a00153c19aa034f6f45f7685856e8157aecdb745f14526194331de81580c605a56b2a4dc8ed54dc9e94"

RPROVIDES:${PN} += "trace-cmd-python \
trace-cmd-python3 \
trace-cmd-python3(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libtraceevent.so.1()(64bit) \
python(abi) \
python3 \
trace-cmd"

inherit rpm
