SUMMARY = "Python package to handle CHM files"
DESCRIPTION = "The chm package provides three modules, chm, chmlib and extra, which \
provide access to the API implemented by the C library chmlib and some \
additional classes and functions. They are used to access MS-ITSS encoded \
files - Compressed Html Help files (.chm)."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.6"

RPM_NAME = "python310-pychm-0.8.6-1.17.aarch64.rpm"
RPM_HASH = "5038ca094a41e5a550ccd555ca19ab6fcc056d9761819d4eafff8d29e4dd6aa2d65d34fb26b65e705da3bfa57b55e4b47bd818a211cff49fea7352ec7290b36a"

RPROVIDES:${PN} += "python3-pychm \
python3.10dist(pychm) \
python310-pychm \
python310-pychm(aarch-64) \
python3dist(pychm)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libchm.so.0()(64bit) \
python(abi)"

inherit rpm
