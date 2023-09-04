SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-curses-3.9.17-4.1.aarch64.rpm"
RPM_HASH = "43b89c8ab6de0e97107e0de49afce91b8438cfade1a3f5a13a32fb412e59dda997dbfbc1f9bbd1e319942132e98a80130ec011a781d85a2330d8373baf29b665"

RPROVIDES:${PN} += "python39-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python39"

inherit rpm
