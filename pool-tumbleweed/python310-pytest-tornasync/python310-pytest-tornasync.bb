SUMMARY = "PyTest plugin for testing Tornado code"
DESCRIPTION = "A pytest plugin that provides some fixtures for testing Tornado \
apps and handling of plain (undecoratored) native coroutine tests."
LICENSE = "MIT"

PV = "0.6.0.post2"

RPM_NAME = "python310-pytest-tornasync-0.6.0.post2-1.15.noarch.rpm"
RPM_HASH = "0b9a97740983b5a922a673112623cd07ece9054a3cd09caf0607ab74dbd853dec0ed29f117082e1c1bdbd89a59418b011326aabfd04230dcca8c64eaf07f51aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-tornasync \
python310-pytest-tornasync \
python3dist-pytest-tornasync"

RDEPENDS:${PN} += "python-abi \
python310-base \
python310-pytest \
python310-tornado"

inherit rpm
