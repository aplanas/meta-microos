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

RPM_NAME = "perl-Convert-UUlib-1.8-1.16.aarch64.rpm"
RPM_HASH = "0f424fc496d327d79dda2bae98661046a2705a5bf160dcd58f9dd0e4382e7283dba2de74e78fa0aa44831941faaca635cec7a26a898a7b9e8f47428660dd2641"

RPROVIDES:${PN} += "p-conulb \
perl-Convert--UUlib \
perl-Convert-UUlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-common--sense"

inherit rpm
