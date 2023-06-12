SUMMARY = "PyTest plugin for testing Tornado code"
DESCRIPTION = "A pytest plugin that provides some fixtures for testing Tornado \
apps and handling of plain (undecoratored) native coroutine tests."
LICENSE = "MIT"

PV = "0.6.0.post2"

RPM_NAME = "python311-pytest-tornasync-0.6.0.post2-1.13.noarch.rpm"
RPM_HASH = "60cb50509cff8d2c089ce0961a7a751265c71f8884dec6d02ac9f8b6f1ea2a992236164337fea45036e7eeeb7838bbb70ac4e54871d670ad3b1295a346f9f14b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-tornasync) \
python311-pytest-tornasync \
python3dist(pytest-tornasync)"
RDEPENDS:${PN} += "python(abi) \
python311-base \
python311-pytest \
python311-tornado"

inherit rpm
