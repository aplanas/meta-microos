SUMMARY = "PyUnit-based test runner with JUnit like XML reporting"
DESCRIPTION = "unittest-xml-reporting is a unittest test runner that can save test results \
to XML files that can be consumed by a wide range of tools, such as build \
systems, IDEs and continuous integration servers."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.2"

RPM_NAME = "python310-unittest-xml-reporting-3.0.2-3.4.noarch.rpm"
RPM_HASH = "a000bfb59c87e7f60f6483bc630f66ccf1db34868f339d68d7c02c4d9e05719a9ef61cc1f5cc28dc5d5692a0b56397ec598f63d6d46cc3110950a4ea8f006a22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-unittest-xml-reporting \
python310-unittest-xml-reporting \
python310-xmlrunner \
python3dist-unittest-xml-reporting"

RDEPENDS:${PN} += "python-abi"

inherit rpm
