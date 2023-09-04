SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.8.17"

RPM_NAME = "python38-curses-3.8.17-2.1.aarch64.rpm"
RPM_HASH = "c9a9bff2d82a19969d7616ae6fb8f3185213e8af422b3e471362fe65a7fc741eea0f783b72c70130e39dd52215f58c5637f8796d477ffe8f92e77a2b476b081e"

RPROVIDES:${PN} += "python38-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python38"

inherit rpm
