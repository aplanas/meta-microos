SUMMARY = "Rect class for Pygame-like rectangular areas"
DESCRIPTION = "PyRect is a simple module with a Rect class for Pygame-like rectangular areas."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python311-PyRect-0.2.0-1.5.noarch.rpm"
RPM_HASH = "6ad39762d385e6bb9392ae5577b4ea37168057bf01083129bf847ae0f60856080a4ec97ef1b07a6f568975ff764e131f40c9a3906012fb2590489de99166bf68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyRect \
python3.11dist-pyrect \
python311-PyRect \
python3dist-pyrect"

RDEPENDS:${PN} += "python-abi"

inherit rpm
