SUMMARY = "BasicTracer reference implementation for OpenTracing"
DESCRIPTION = "Python 'BasicTracer' reference implementation for OpenTracing."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python311-basictracer-3.2.0-2.8.noarch.rpm"
RPM_HASH = "3b163a76761a50c8895595ee41a6311db96231ce94ffc0f87fbfcb8aa439946d15122e20769926678626a8ef47d0cd4145f2e0b94d32dbbbd9b3b5d38df564ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-basictracer \
python3.11dist-basictracer \
python311-basictracer \
python3dist-basictracer"

RDEPENDS:${PN} += "python-abi \
python311-opentracing \
python311-protobuf \
python311-six"

inherit rpm
