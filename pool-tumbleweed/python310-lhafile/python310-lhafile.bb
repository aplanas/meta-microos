SUMMARY = "LHA archive support for Python"
DESCRIPTION = "Lhafile is a python C extension to extract lha files (.lzh). \
The interface is similar to the zipfile module in the regular \
Python distribution."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python310-lhafile-0.2.2-1.24.aarch64.rpm"
RPM_HASH = "7db3a31dfac6a95cf50a682a3c76421830edb1f4cf744a654bae24dad9a3d03d12c17fbdc80dda7c4b0016a079b59c643c38b4aedcf828eabf413da4a1c5480b"

RPROVIDES:${PN} += "python3-lhafile \
python3.10dist(lhafile) \
python310-lhafile \
python310-lhafile(aarch-64) \
python3dist(lhafile)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
