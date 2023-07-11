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

RPM_NAME = "python39-Cheetah3-3.2.6.post1-1.11.aarch64.rpm"
RPM_HASH = "8936964f9087a75b7146c20deeb97c4a09d87bc3c0602c7d9e840c62dd6865f63cb655765e641dac3dd221c3d4039cbaf7377232b4714d8312ca2a0ab318676c"

RPROVIDES:${PN} += "python3.9dist-cheetah3 \
python39-Cheetah \
python39-Cheetah3 \
python39-cheetah \
python3dist-cheetah3"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
