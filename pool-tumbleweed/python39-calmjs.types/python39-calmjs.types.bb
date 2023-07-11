SUMMARY = "Types for the calmjs framework"
DESCRIPTION = "A collection of types (mostly exception classes) for use with |calmjs|_."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-calmjs.types-1.0.1-2.1.noarch.rpm"
RPM_HASH = "5c74d6012a794646a3815bc27ce8ada5584880ba591d7eddaaf389b05272309796b757d57084e491e802d708ada6b2d1ce9e3fdfc9d4fe9a065714a311f2f668"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-calmjs.types \
python39-calmjs.types \
python3dist-calmjs.types"

RDEPENDS:${PN} += "python-abi \
python39-setuptools"

inherit rpm
