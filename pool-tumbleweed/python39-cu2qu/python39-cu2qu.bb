SUMMARY = "Cubic-to-quadratic bezier curve conversion"
DESCRIPTION = "Cubic-to-quadratic bezier curve conversion"
LICENSE = "Apache-2.0"

PV = "1.6.7.post2"

RPM_NAME = "python39-cu2qu-1.6.7.post2-1.4.aarch64.rpm"
RPM_HASH = "e9637677fb25363cc02ad27612621b7919e83b209092ba28869bfdd55c2fe9ebd82d098b5c9fc9b088e9c498177daa5178f230b6f7eb4b9d7ac2a763df5b7925"

RPROVIDES:${PN} += "python3.9dist(cu2qu) \
python39-cu2qu \
python39-cu2qu(aarch-64) \
python3dist(cu2qu)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-FontTools"

inherit rpm
