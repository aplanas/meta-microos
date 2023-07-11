SUMMARY = "PyUnit-based test runner with JUnit like XML reporting"
DESCRIPTION = "unittest-xml-reporting is a unittest test runner that can save test results \
to XML files that can be consumed by a wide range of tools, such as build \
systems, IDEs and continuous integration servers."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.2"

RPM_NAME = "python311-unittest-xml-reporting-3.0.2-3.4.noarch.rpm"
RPM_HASH = "c210fd316d86f2a23a95d9a754e892d58fb09500090db37a42fe7900a58fc31d6e5e7204283006363f3f07c9e3773dc3acdb0db6d846f951102766a6f3b8e263"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unittest-xml-reporting \
python3-xmlrunner \
python3.11dist-unittest-xml-reporting \
python311-unittest-xml-reporting \
python311-xmlrunner \
python3dist-unittest-xml-reporting"

RDEPENDS:${PN} += "python-abi"

inherit rpm
