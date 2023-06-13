SUMMARY = "Basic immutable container types for Python"
DESCRIPTION = "Basic immutable container types for Python. \
 \
A simple implementation that's designed for simplicity over performance. \
 \
Use these in circumstances where it may result in more comprehensible code, or \
when you want to create custom types with restricted, immutable interfaces."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "python39-itypes-1.2.0-1.8.noarch.rpm"
RPM_HASH = "6c777fc21d3bb5964192a3e24ae8cde37b4a1f23fcfb1933dad1e1bdc71b1667094f837615e9f3a2fe6bb489b45eeba3ba9f7ef38968b0540ac4053eef6ccd27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(itypes) \
python39-itypes \
python3dist(itypes)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
