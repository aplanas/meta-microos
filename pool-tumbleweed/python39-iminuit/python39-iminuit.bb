SUMMARY = "Python bindings for MINUIT2"
DESCRIPTION = "iminuit is a Python interface to the MINUIT2 C++ package. \
 \
It can be used as a general function minimization method, \
but is most commonly used for likelihood fits of models to data, \
and to get model parameter error estimates from likelihood profile analysis."
LICENSE = "MIT"

PV = "2.18.0"

RPM_NAME = "python39-iminuit-2.18.0-1.1.aarch64.rpm"
RPM_HASH = "e68641a5c0a37985895afb44f495410548d6626230f7463784c4f216c1dadef007bd394cdde354e03899b99c1ffc17a872cb8ff16d3b3301be96a48659138e5b"

RPROVIDES:${PN} += "python3.9dist(iminuit) \
python39-iminuit \
python39-iminuit(aarch-64) \
python3dist(iminuit)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python39-numpy"

inherit rpm
