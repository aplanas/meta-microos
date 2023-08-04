SUMMARY = "Python module to use libmagic"
DESCRIPTION = "This package contains the Python binding that require the magic 'file' \
interface."
LICENSE = "BSD-3-Clause & BSD-4-Clause"

PV = "5.45"

RPM_NAME = "python310-magic-5.45-1.1.aarch64.rpm"
RPM_HASH = "b19b8311ca3ecb14e00e55382a389101dcbc48107c0800ceb17432edcd731adc4a73e7cbf8457011b95aad6e7198c4624394478e4d065ebf730ad2b6f8d685c1"

RPROVIDES:${PN} += "python3.10dist-file-magic \
python310-file-magic \
python310-magic \
python3dist-file-magic"

RDEPENDS:${PN} += "libmagic1 \
python-abi"

inherit rpm
