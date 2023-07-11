SUMMARY = "Python tool to find and list requirements of a Python project"
DESCRIPTION = "Requirements-detector is a Python tool which attempts to find and list \
the requirements of a Python project. \
 \
When run from the root of a Python project, it will try to ascertain \
which libraries and the versions of those libraries that the project \
depends on."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python310-requirements-detector-0.7-2.13.noarch.rpm"
RPM_HASH = "9f09b0f261af9dec1648dce0dc007018f11ce10cb4d7765eaa9c799fc6eeada89a1e7abe8d3363c61b9cb6762d1ebd5b95c8f7ee9f6fc4900c36839404b678de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requirements-detector \
python310-requirements-detector \
python3dist-requirements-detector"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-astroid \
update-alternatives"

inherit rpm
