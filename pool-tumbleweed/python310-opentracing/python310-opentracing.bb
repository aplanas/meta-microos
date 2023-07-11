SUMMARY = "OpenTracing API for Python"
DESCRIPTION = "OpenTracing API for Python. \
See documentation at http://opentracing.io"
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python310-opentracing-2.4.0-4.4.noarch.rpm"
RPM_HASH = "4e001da6f672599835f96c3fc44acb001a2704e4d0d05f87e1e393d454e913211a915b973ce9244428a05e8847bc704dac9aae351e1f571a12771e1da679c0c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-opentracing \
python310-opentracing \
python3dist-opentracing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
