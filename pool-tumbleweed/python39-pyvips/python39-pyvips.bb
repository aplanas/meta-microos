SUMMARY = "Python bindings for VIPS image processing library"
DESCRIPTION = "This package contains the Python bindings for the VIPS library."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python39-pyvips-2.2.1-1.3.noarch.rpm"
RPM_HASH = "d8f71cc94b2a277593fd82da0cff79812d757161bee84dd4944c0798bb0ac3af178e561840a568e4a1ce03eb994c920572f1ee28475a2352b3f288dc73e19876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyvips \
python39-pyvips \
python3dist-pyvips"

RDEPENDS:${PN} += "python-abi \
python39-cffi"

inherit rpm
