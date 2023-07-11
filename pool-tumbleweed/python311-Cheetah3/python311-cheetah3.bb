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

RPM_NAME = "python311-Cheetah3-3.2.6.post1-1.11.aarch64.rpm"
RPM_HASH = "d664ffa85cafbad3be4c8ff96460c05df4f320dd0a25bd9719ea7462916a415bf67f3efcc45bb06e007275837348299fc04474037e73fabd7fab65189bcc3444"

RPROVIDES:${PN} += "python3-Cheetah \
python3-Cheetah3 \
python3-cheetah \
python3.11dist-cheetah3 \
python311-Cheetah \
python311-Cheetah3 \
python311-cheetah \
python3dist-cheetah3"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
