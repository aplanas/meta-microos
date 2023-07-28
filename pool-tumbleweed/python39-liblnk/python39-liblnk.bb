SUMMARY = "Library and tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library and tools to access Windows Shortcut File (LNK) format files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "python39-liblnk-20230716-1.1.aarch64.rpm"
RPM_HASH = "5b7df85709969f55e1e6fc8c771a7658bbaf16098dfa9b6b6eb2ffc5ab32b2bc6f206c979c016f08ef0e2a6c33ea42b1e11cb70642c3160dd06ebd009ae44060"

RPROVIDES:${PN} += "python39-liblnk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
liblnk.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
