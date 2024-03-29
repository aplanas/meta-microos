SUMMARY = "Tools to access Microsoft PST and OST files"
DESCRIPTION = "Tools to access the Personal Folder File (PFF) and the Offline Folder \
File (OFF) format. These are used in several file types: PAB \
(Personal Address Book), PST (Personal Storage Table) and OST \
(Offline Storage Table)."
LICENSE = "LGPL-3.0-or-later"

PV = "20230325"

RPM_NAME = "libpff-tools-20230325-2.1.aarch64.rpm"
RPM_HASH = "958d2b897d41a56169b6891528ca5b16b15331a6164425816ca3ea271c6e18a383f1991efd41ec198f525724780384e879dfa50747e391c71111d949ffa886e9"

RPROVIDES:${PN} += "libpff-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfmapi.so.1 \
libfvalue.so.1 \
libpff.so.1 \
libpff1"

inherit rpm
