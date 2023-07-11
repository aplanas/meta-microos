SUMMARY = "General Hardware Management Initiative (IPMI and others) -- Documentation"
DESCRIPTION = "This is a pure python implementation of IPMI protocol. \
 \
pyghmicons and pyghmiutil are example scripts to show how one may incorporate \
this library into python code"
LICENSE = "Apache-2.0"

PV = "1.5.61"

RPM_NAME = "python-pyghmi-doc-1.5.61-1.1.noarch.rpm"
RPM_HASH = "b4594c1b7e71b9762c7e0471aeb54ffef55596767edfe02ccae7a58688d055de30268d9c4aa9c7c70c03879391c1cacb8c82514bd58cd54c0d79a3de18ae5faa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pyghmi-doc"

RDEPENDS:${PN} += ""

inherit rpm
