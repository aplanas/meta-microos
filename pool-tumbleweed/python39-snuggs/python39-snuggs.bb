SUMMARY = "S-expressions tool for Numpy"
DESCRIPTION = "Snuggs are s-expressions for Numpy."
LICENSE = "MIT"

PV = "1.4.7"

RPM_NAME = "python39-snuggs-1.4.7-2.9.noarch.rpm"
RPM_HASH = "13b810cbfd74c31e2d6c98ab7f116aa9e087592c16da29c9f9746885089fc6a8645e6c338d17e543bd3522cfa56811dc948d6a3319b6f350a9a1fa3b72d6970d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-snuggs \
python39-snuggs \
python3dist-snuggs"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-pyparsing"

inherit rpm
