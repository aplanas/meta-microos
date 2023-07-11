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

RPM_NAME = "python310-Cheetah3-3.2.6.post1-1.11.aarch64.rpm"
RPM_HASH = "36de0d1b1aa74cdd2fb441aa2d642fca395af1baedb1f268cc3f541a14930ee75b62d0f7930bf1853b06b4c993288bb12aaa5af04c4d27f210c4b1dca01de36d"

RPROVIDES:${PN} += "python3.10dist-cheetah3 \
python310-Cheetah \
python310-Cheetah3 \
python310-cheetah \
python3dist-cheetah3"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
