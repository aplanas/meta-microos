SUMMARY = "Bulk Email and URL extraction tool"
DESCRIPTION = "bulk_extractor is a C++ program that scans a disk image, a file, or a \
directory of files and extracts useful information without parsing the \
file system or file system structures. The results are stored in feature \
files that can be easily inspected, parsed, or processed with automated \
tools. bulk_extractor also created a histograms of features that it finds, \
as features that are more common tend to be more important."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "bulk_extractor-2.0.0-3.1.aarch64.rpm"
RPM_HASH = "89184cbf844aaa0862b9785ec94ab4141e1baba5140449c33d4209c1667406d26f911ca9daf46c73b96f6aa935381c461aff6993e8ab82067630b82142114ae8"

RPROVIDES:${PN} += "bulk_extractor \
bulk_extractor(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libewf.so.3()(64bit) \
libewf.so.3(V_20230212)(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
sleuthkit"

inherit rpm
