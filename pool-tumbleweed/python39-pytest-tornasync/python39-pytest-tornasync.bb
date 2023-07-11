SUMMARY = "PyTest plugin for testing Tornado code"
DESCRIPTION = "A pytest plugin that provides some fixtures for testing Tornado \
apps and handling of plain (undecoratored) native coroutine tests."
LICENSE = "MIT"

PV = "0.6.0.post2"

RPM_NAME = "python39-pytest-tornasync-0.6.0.post2-1.15.noarch.rpm"
RPM_HASH = "740e3fb57600a540a84e6a1370f284383182911a29e9122d42c046968a47dad1f89f22475c12635251c2173a0ba7ce128dcdcfcb58800496e2e242173de240c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-tornasync \
python39-pytest-tornasync \
python3dist-pytest-tornasync"

RDEPENDS:${PN} += "python-abi \
python39-base \
python39-pytest \
python39-tornado"

inherit rpm
