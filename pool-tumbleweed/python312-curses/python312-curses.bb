SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.12.0b4"

RPM_NAME = "python312-curses-3.12.0b4-1.1.aarch64.rpm"
RPM_HASH = "77ee50fd4ba41c7536235a2b5ea17eea46bf1cec27fa7b4465ed60681831f1ca90cbcefd6d74107bf8510e3a68964c7cacc25edc89f8a30c1f4e0edae2932a8c"

RPROVIDES:${PN} += "python312-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
python-abi \
python312"

inherit rpm
