SUMMARY = "Tools to access Microsoft PST and OST files"
DESCRIPTION = "Tools to access the Personal Folder File (PFF) and the Offline Folder \
File (OFF) format. These are used in several file types: PAB \
(Personal Address Book), PST (Personal Storage Table) and OST \
(Offline Storage Table)."
LICENSE = "LGPL-3.0-or-later"

PV = "20230325"

RPM_NAME = "libpff-tools-20230325-1.7.aarch64.rpm"
RPM_HASH = "95d068e561159e764a96d7f168df6e06950f344f67889125da7a8f1187556ed5e694f7e9928bf9213218e7c2a6f231b2c4da6b2fd522655a0cca033448d35e54"

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
