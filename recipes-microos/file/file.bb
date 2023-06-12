SUMMARY = "A Tool to Determine File Types"
DESCRIPTION = "With the file command, you can obtain information on the file type of a \
specified file. File type recognition is controlled by the file \
/etc/magic, which contains the classification criteria. This command is \
used by apsfilter to permit automatic printing of different file types."
LICENSE = "BSD-2-Clause"

PV = "5.44"

RPM_NAME = "file-5.44-2.1.aarch64.rpm"
RPM_HASH = "66bd77f8cd5db1ffc036d5dd31be73faa1a9b33c7d71e5c12168993715f01c1c7add1c5f695bf510f3f9038a734c61df58f73b722cc25dc3eef9849680e39360"

RPROVIDES:${PN} += "file \
file(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmagic.so.1()(64bit) \
libseccomp.so.2()(64bit)"

inherit rpm
