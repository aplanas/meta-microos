SUMMARY = "OpenTracing API for Python"
DESCRIPTION = "OpenTracing API for Python. \
See documentation at http://opentracing.io"
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python310-opentracing-2.4.0-5.1.noarch.rpm"
RPM_HASH = "eb131453317cbbb6e71d3c14267362bc4210ece6cb1f7f4f516b3ce49210677fadb534d1c8e5b1ed2f8f9e8b21fc066f572a2651148c8c1966779d55398918a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-opentracing \
python310-opentracing \
python3dist-opentracing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
