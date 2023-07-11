SUMMARY = "Bulk Email and URL extraction tool"
DESCRIPTION = "bulk_extractor is a C++ program that scans a disk image, a file, or a \
directory of files and extracts useful information without parsing the \
file system or file system structures. The results are stored in feature \
files that can be easily inspected, parsed, or processed with automated \
tools. bulk_extractor also created a histograms of features that it finds, \
as features that are more common tend to be more important."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "bulk_extractor-2.0.0-3.2.aarch64.rpm"
RPM_HASH = "1b46ae169f8d71f319c006337e247d4184f5fa5b67bfc765572c842f0f546853f9320c207a1d68ac9ec3b17f7ca2fb1558c99c158a8adef196646fd72f59c73c"

RPROVIDES:${PN} += "bulk-extractor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libewf.so.3 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
sleuthkit"

inherit rpm
