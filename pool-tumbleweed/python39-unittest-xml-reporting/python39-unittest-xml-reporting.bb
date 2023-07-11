SUMMARY = "PyUnit-based test runner with JUnit like XML reporting"
DESCRIPTION = "unittest-xml-reporting is a unittest test runner that can save test results \
to XML files that can be consumed by a wide range of tools, such as build \
systems, IDEs and continuous integration servers."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.2"

RPM_NAME = "python39-unittest-xml-reporting-3.0.2-3.4.noarch.rpm"
RPM_HASH = "1e5acfe97173d434bc2e43de5809820b0ce1348a5ef36ce6898be6b1c7c25d79775aa45dcfeab9242edc777e5cf739fb7bad4d1f3c9ef852611c659c8f32fef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-unittest-xml-reporting \
python39-unittest-xml-reporting \
python39-xmlrunner \
python3dist-unittest-xml-reporting"

RDEPENDS:${PN} += "python-abi"

inherit rpm
