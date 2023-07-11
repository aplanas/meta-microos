SUMMARY = "OpenTracing API for Python"
DESCRIPTION = "OpenTracing API for Python. \
See documentation at http://opentracing.io"
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python39-opentracing-2.4.0-4.4.noarch.rpm"
RPM_HASH = "f82a1adea8037a6e2acad4673b59423b3ba05b5269d8d3b15bffb88bd2433870fd489b18c1c991c0773896621a49a1204ab079d210cb121a2a07fed116e0d876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-opentracing \
python39-opentracing \
python3dist-opentracing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
