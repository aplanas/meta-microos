SUMMARY = "BasicTracer reference implementation for OpenTracing"
DESCRIPTION = "Python 'BasicTracer' reference implementation for OpenTracing."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python310-basictracer-3.2.0-2.6.noarch.rpm"
RPM_HASH = "64970169f7ce84630000c6bef8ba5533ea143cd6670387adfd41d1e9a4042761f1a5c306700759aaf2ead1c5e15f24f0132f2c9ec38a23b0f607ef8d51d28e09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-basictracer \
python3.10dist(basictracer) \
python310-basictracer \
python3dist(basictracer)"

RDEPENDS:${PN} += "python(abi) \
python310-opentracing \
python310-protobuf \
python310-six"

inherit rpm
