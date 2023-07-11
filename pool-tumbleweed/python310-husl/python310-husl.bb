SUMMARY = "A Python implementation of the 'Human-friendly HSL' (HSLuv) color model"
DESCRIPTION = "A Python implementation of HUSL (revision 3)."
LICENSE = "MIT"

PV = "4.0.3"

RPM_NAME = "python310-husl-4.0.3-3.18.noarch.rpm"
RPM_HASH = "60e4a9df76418e7bf31feee46ca2a22418f147a7d457bc42a1d239e6412f47da9164d82f3e09ecff1ac8dfe2f64db0ca40e5b82657b358d298d2aa8c9fa9ac63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-husl \
python310-husl \
python3dist-husl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
