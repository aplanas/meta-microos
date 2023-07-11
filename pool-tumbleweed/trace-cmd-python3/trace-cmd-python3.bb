SUMMARY = "Python plugin support for trace-cmd"
DESCRIPTION = "Python plugin support for trace-cmd"
LICENSE = "GPL-2.0-only"

PV = "3.2"

RPM_NAME = "trace-cmd-python3-3.2-1.1.aarch64.rpm"
RPM_HASH = "00316b3aac2779be948b63e26c7c2e519addd2b44c8c26cf8128c467cbc596c4a2881fb0e348a1f8190c0e68e076b0230595ebfd3ca4a6515b03fbdf6c61d15b"

RPROVIDES:${PN} += "trace-cmd-python \
trace-cmd-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
python-abi \
python3 \
trace-cmd"

inherit rpm
