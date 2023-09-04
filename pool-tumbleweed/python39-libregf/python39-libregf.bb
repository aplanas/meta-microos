SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "python39-libregf-20230319-2.1.aarch64.rpm"
RPM_HASH = "9ccfea68b4c44871f125486b5e099b6d3c73278ce442716faa381f101b0bb5f69e899e50869607d68664f0f84a3ef4aeafdb0c89e7d9dc13e5527d0d460b9f28"

RPROVIDES:${PN} += "python39-libregf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libregf.so.1 \
python-abi"

inherit rpm
