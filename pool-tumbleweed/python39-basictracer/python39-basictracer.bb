SUMMARY = "BasicTracer reference implementation for OpenTracing"
DESCRIPTION = "Python 'BasicTracer' reference implementation for OpenTracing."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python39-basictracer-3.2.0-2.6.noarch.rpm"
RPM_HASH = "da0e15249d0cce3218e54fa2c328058cb590fe511d5686f9a82393dc3dbdb708fa3f15932ac8d00eaa1d97c88c654babed568c43f035b2ac7742b7a3d9305e1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(basictracer) \
python39-basictracer \
python3dist(basictracer)"

RDEPENDS:${PN} += "python(abi) \
python39-opentracing \
python39-protobuf \
python39-six"

inherit rpm
