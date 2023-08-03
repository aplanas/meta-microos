SUMMARY = "Bulk Email and URL extraction tool"
DESCRIPTION = "bulk_extractor is a C++ program that scans a disk image, a file, or a \
directory of files and extracts useful information without parsing the \
file system or file system structures. The results are stored in feature \
files that can be easily inspected, parsed, or processed with automated \
tools. bulk_extractor also created a histograms of features that it finds, \
as features that are more common tend to be more important."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "bulk_extractor-2.0.0-4.1.aarch64.rpm"
RPM_HASH = "02bec0f722055e4c878252fc749e5ba5bde4e98121672991ba1d116b654c7b17f421eb48af6683ee1c285aa25bc8e49680ff2c29d53af360e965f9b9f94d8530"

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
