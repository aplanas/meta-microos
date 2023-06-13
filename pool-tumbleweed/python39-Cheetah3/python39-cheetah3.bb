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

RPM_NAME = "python39-Cheetah3-3.2.6.post1-1.9.aarch64.rpm"
RPM_HASH = "bffe13061ffe648409a37df98deaad226d86d0a20ac100b07a612cbccacb46b3b7162a9bb48c93741f6904e0321647f19d04cb9caf9e917bd5a4219e612c79bb"

RPROVIDES:${PN} += "python3.9dist(cheetah3) \
python39-Cheetah \
python39-Cheetah3 \
python39-Cheetah3(aarch-64) \
python39-cheetah \
python3dist(cheetah3)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
