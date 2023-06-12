SUMMARY = "Basic immutable container types for Python"
DESCRIPTION = "Basic immutable container types for Python. \
 \
A simple implementation that's designed for simplicity over performance. \
 \
Use these in circumstances where it may result in more comprehensible code, or \
when you want to create custom types with restricted, immutable interfaces."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "python310-itypes-1.2.0-1.8.noarch.rpm"
RPM_HASH = "3d62a1519493bd488c1b61773fc505d5da62bcf98286f39f64fb96be59f29deb051905a7962fe0a0301b4b6cc28703afec268e6168c77f866c3c3e8c0979f40f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-itypes \
python3.10dist(itypes) \
python310-itypes \
python3dist(itypes)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
