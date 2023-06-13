SUMMARY = "Hankel Transformations using method of Ogata 2005"
DESCRIPTION = "Hankel is a Python library to perform simple and accurate Hankel \
transformations using the method of Ogata 2005."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python39-hankel-1.2.1-2.3.noarch.rpm"
RPM_HASH = "7b7f9086bd91cca5325e470e92437267b2bae43dee07eb3e7bf033fa585383bec691253253d09b6062de470d5aeb3acbfcbdda4861a89f52ecb71e2f3a562829"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hankel) \
python39-hankel \
python3dist(hankel)"

RDEPENDS:${PN} += "python(abi) \
python39-mpmath \
python39-numpy \
python39-scipy"

inherit rpm
