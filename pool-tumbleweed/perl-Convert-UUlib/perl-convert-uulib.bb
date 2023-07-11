SUMMARY = "Decode uu/xx/b64/mime/yenc/etc-encoded data from a massive number of files"
DESCRIPTION = "This module started as an interface to the uulib/uudeview library by Frank \
Pilhofer that can be used to decode all kinds of usenet (and other) binary \
messages. \
 \
After upstream abondoned the project, th library was continuously bugfixed \
and improved in this module, with major focuses on security fixes, \
correctness and speed (that does not mean that this library is considered \
safe with untrusted data, but it surely is safer than the poriginal \
uudeview). \
 \
Read the file doc/library.pdf from the distribution for in-depth \
information about the C-library used in this interface, and the rest of \
this document and especially the non-trivial decoder program at the end."
LICENSE = "GPL-1.0-or-later"

PV = "1.8"

RPM_NAME = "perl-Convert-UUlib-1.8-1.15.aarch64.rpm"
RPM_HASH = "3945a170bb2bb945d261bd19f7d92cbf7e45712ac364cc0c9cfc72df3dc2de58abf5e16bc6f15d15ed966d690d9e1730dadea992eaa794edd3539a06022f94a4"

RPROVIDES:${PN} += "p-conulb \
perl-Convert--UUlib \
perl-Convert-UUlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-common--sense"

inherit rpm
