SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-curses-3.10.12-1.1.aarch64.rpm"
RPM_HASH = "aef2c456f9f788d86bdc93bb042e87ff17ccdfded0859ac04733d1e8e73650cecc7fdf0ee6002e32cbfec1fbf4a868327b352a6ed071572a763de47f3a1a5f8b"

RPROVIDES:${PN} += "python310-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python310"

inherit rpm
