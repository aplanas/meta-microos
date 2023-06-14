SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.11.3"

RPM_NAME = "python311-curses-3.11.3-1.1.aarch64.rpm"
RPM_HASH = "3fe6aef0c746a4ce586fdcbb3a6dc347f888ff3cd74c9fc5db51783ed0a55cbabe693252a97f603e0c462ab80fa9ddacfc03b25756961f862eb44b485ba8be11"

RPROVIDES:${PN} += "python311-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python311"

inherit rpm
