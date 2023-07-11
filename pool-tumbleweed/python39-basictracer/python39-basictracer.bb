SUMMARY = "BasicTracer reference implementation for OpenTracing"
DESCRIPTION = "Python 'BasicTracer' reference implementation for OpenTracing."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python39-basictracer-3.2.0-2.8.noarch.rpm"
RPM_HASH = "aabef991123a59e1e66d6694de057587a2564ae1089949ecd3efc6aabf8478efb1a70f0ba519cb5d76d181068a52dddbb64729538d91996ac9ca0ce2f42b48e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-basictracer \
python39-basictracer \
python3dist-basictracer"

RDEPENDS:${PN} += "python-abi \
python39-opentracing \
python39-protobuf \
python39-six"

inherit rpm
