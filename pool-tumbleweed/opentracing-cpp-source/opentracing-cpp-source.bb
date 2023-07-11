SUMMARY = "Source code of the OpenTracing C++ API"
DESCRIPTION = "Source code of opentracing-cpp - the C++ implementation of the OpenTracing API."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "opentracing-cpp-source-1.6.0-1.10.noarch.rpm"
RPM_HASH = "85aab07d67825371da34ad454b6712241dbad6b89260a57268d5e25db6df926b7130d4ca42eeb0a44d5271cb6c21066c1c5a5abbf80f18e1d8e940cf108d9495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opentracing-cpp-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh"

inherit rpm
