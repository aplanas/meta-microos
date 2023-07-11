SUMMARY = "BasicTracer reference implementation for OpenTracing"
DESCRIPTION = "Python 'BasicTracer' reference implementation for OpenTracing."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python310-basictracer-3.2.0-2.8.noarch.rpm"
RPM_HASH = "cf6b4d43a5175c0e6201ee05d2273c5dc0eb5f9ffac90574b73ab3dc64c4f4ceb0264fa1450ba370dcdde58f984e955ff3433465fc3eac59c0001d97e671f7e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-basictracer \
python310-basictracer \
python3dist-basictracer"

RDEPENDS:${PN} += "python-abi \
python310-opentracing \
python310-protobuf \
python310-six"

inherit rpm
