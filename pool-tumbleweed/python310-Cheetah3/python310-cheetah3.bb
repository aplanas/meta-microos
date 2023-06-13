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

RPM_NAME = "python310-Cheetah3-3.2.6.post1-1.9.aarch64.rpm"
RPM_HASH = "dfedeaf6cd994c1a3b544223591d5c8d2bd98275018c9945da2a11529108b0b55cb0cb87dcbe7052a14caba0e9b6d0be4b6069512af62468bc988a9d7ce4efb0"

RPROVIDES:${PN} += "python3-Cheetah \
python3-Cheetah3 \
python3-cheetah \
python3.10dist(cheetah3) \
python310-Cheetah \
python310-Cheetah3 \
python310-Cheetah3(aarch-64) \
python310-cheetah \
python3dist(cheetah3)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
