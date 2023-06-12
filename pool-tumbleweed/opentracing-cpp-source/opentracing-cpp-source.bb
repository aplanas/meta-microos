SUMMARY = "Source code of the OpenTracing C++ API"
DESCRIPTION = "Source code of opentracing-cpp - the C++ implementation of the OpenTracing API."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "opentracing-cpp-source-1.6.0-1.9.noarch.rpm"
RPM_HASH = "37eae12d478cb09458c3f54c5e2608b4bca45a3b56decfbd43c4f82b46f6a2e2308f0e39c01991dddf8708b69691736e7318f4c005cd0691722b80becd3a6f20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opentracing-cpp-source"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh"

inherit rpm
