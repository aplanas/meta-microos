SUMMARY = "Library to access the executable (EXE) format"
DESCRIPTION = "libexe is a library and related tools to parse .exe files \
(specifically PE/COFF) and the resources stored in them using \
libwrc. This functionality is used in libevt and libevx to parse \
EventLog messages from PE/COFF message files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "python39-libexe-20210424-4.10.aarch64.rpm"
RPM_HASH = "162bc048b2d53cd24693ee55755ec1fde9eda81664984d5980d9fe33a27f6e9ecc3854bd74520968a65584846a35c3d611b86fa59945ccf726efcd8d338e61e7"

RPROVIDES:${PN} += "python39-libexe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libexe.so.1 \
python-abi"

inherit rpm
