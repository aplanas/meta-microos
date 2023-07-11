SUMMARY = "Types for the calmjs framework"
DESCRIPTION = "A collection of types (mostly exception classes) for use with |calmjs|_."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-calmjs.types-1.0.1-2.1.noarch.rpm"
RPM_HASH = "855d52b3c1e037f3f0feefabf6d851c1d05daf111c87c176cbdaaab812fd8be548032ba74296ed4eabd3716ae3b3b9a3d8f39057e74dea58dff6696a719c8efb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-calmjs.types \
python310-calmjs.types \
python3dist-calmjs.types"

RDEPENDS:${PN} += "python-abi \
python310-setuptools"

inherit rpm
