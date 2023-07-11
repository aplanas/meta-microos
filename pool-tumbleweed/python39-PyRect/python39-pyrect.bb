SUMMARY = "Rect class for Pygame-like rectangular areas"
DESCRIPTION = "PyRect is a simple module with a Rect class for Pygame-like rectangular areas."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python39-PyRect-0.2.0-1.5.noarch.rpm"
RPM_HASH = "edbc4d98b80065bd5ed2ff08d6e36bd850bab3c8114b65c0c4f5cb0f0ac2cb3970cfb1d06eb8b1b4398858e12ba73a1e76f87dd4bedb0ca763dfac6c1c9ad243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyrect \
python39-PyRect \
python3dist-pyrect"

RDEPENDS:${PN} += "python-abi"

inherit rpm
