SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.9.18"

RPM_NAME = "python39-curses-3.9.18-1.1.aarch64.rpm"
RPM_HASH = "44dd520a611c2046daf936d26d8ba9f7487e1e2872e5a499a829f0ffde95eed9324d57a71b1d2292644c84e9073d4842633c74ca9f2b390d759220482081d2b1"

RPROVIDES:${PN} += "python39-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python39"

inherit rpm
