SUMMARY = "Hangul Text to Postscript Converter"
DESCRIPTION = "Convert plain hangul text into postscript form. By Choi Jun Ho, the \
Junker <junker@jazz.snu.ac.kr>. \
 \
 \
 \
Authors: \
-------- \
    Choi Jun Ho <junker@jazz.snu.ac.kr>"
LICENSE = "SUSE-Public-Domain"

PV = "2.3.1"

RPM_NAME = "nh2ps-2.3.1-676.25.aarch64.rpm"
RPM_HASH = "3ad624c7d68c8203de0887c3ac76d948bb8bbcf420e5a332350af5569f8c993d824c8f22bf57a480216656a93b74df35272d3f74921fb83482b6a82654e55163"

RPROVIDES:${PN} += "nh2ps \
nh2ps(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
