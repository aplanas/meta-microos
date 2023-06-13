SUMMARY = "Python Support for the DjVu Image Format"
DESCRIPTION = "python-djvulibre is a set of Python bindings for the DjVuLibre library, \
an open source implementation of DjVu."
LICENSE = "GPL-2.0-only"

PV = "0.8.6"

RPM_NAME = "python310-djvulibre-0.8.6-2.12.aarch64.rpm"
RPM_HASH = "ee173c8fe0bf884f6b15bddeddfd65811f82ebe7d3ef6619aea8d2b694ce95530118b8f38e39677e783ba632b63aaa686bd682b2897632e79e5d5fd777c48119"

RPROVIDES:${PN} += "python3-djvulibre \
python3.10dist(python-djvulibre) \
python310-djvulibre \
python310-djvulibre(aarch-64) \
python3dist(python-djvulibre)"

RDEPENDS:${PN} += "djvulibre \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdjvulibre.so.21()(64bit) \
python(abi)"

inherit rpm
