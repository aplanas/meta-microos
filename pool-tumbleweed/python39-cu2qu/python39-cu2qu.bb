SUMMARY = "Cubic-to-quadratic bezier curve conversion"
DESCRIPTION = "Cubic-to-quadratic bezier curve conversion"
LICENSE = "Apache-2.0"

PV = "1.6.7.post2"

RPM_NAME = "python39-cu2qu-1.6.7.post2-1.6.aarch64.rpm"
RPM_HASH = "b9c55477492593b30dcd936944280cce1162ac1ac903f169902cf4554bc0b9aa6ba46e333509d7f2f80d305b97785a6d475af5876579cd2d896815626469a65b"

RPROVIDES:${PN} += "python3.9dist-cu2qu \
python39-cu2qu \
python3dist-cu2qu"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-FontTools"

inherit rpm
