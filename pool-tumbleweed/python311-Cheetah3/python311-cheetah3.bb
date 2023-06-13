SUMMARY = "Template engine and code generation tool"
DESCRIPTION = "Cheetah is an open source template engine and code generation tool. \
 \
It can be used standalone or combined with other tools and frameworks. \
Web development is its principle use, but Cheetah is flexible and can \
also be used to generate C++ game code, Java, SQL, form emails and even \
Python code. \
 \
It is a fork of the original CheetahTemplate library."
LICENSE = "MIT"

PV = "3.2.6.post1"

RPM_NAME = "python311-Cheetah3-3.2.6.post1-1.9.aarch64.rpm"
RPM_HASH = "2ca19e59f67e42b8aeeab07b110128df792f173e6d768a8812b9d5f9b734843984674db67792490dfd2ee56ff4d122c8bde6525dba5ec1edd909bbe4e11c3b18"

RPROVIDES:${PN} += "python3.11dist(cheetah3) \
python311-Cheetah \
python311-Cheetah3 \
python311-Cheetah3(aarch-64) \
python311-cheetah \
python3dist(cheetah3)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
