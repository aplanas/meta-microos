SUMMARY = "Lua-based build system"
DESCRIPTION = "Bam is a build system focusing on arbitrary build scripts. Instead of \
having a custom language, it uses Lua to describe the build steps."
LICENSE = "Zlib"

PV = "0.5.1"

RPM_NAME = "bam-0.5.1-5.3.aarch64.rpm"
RPM_HASH = "17e104dc90e3517c1ead06228ef82e8cbdf83cb3ca2b6d9c4d1c325492010363c40f1afb2b7b6d2fdbf91c2b17ce87bc79115c3f3ae7c709ea9d30dd27fc1042"

RPROVIDES:${PN} += "bam \
bam(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblua5.3.so.5()(64bit)"

inherit rpm
