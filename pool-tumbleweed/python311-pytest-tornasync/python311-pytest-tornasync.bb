SUMMARY = "PyTest plugin for testing Tornado code"
DESCRIPTION = "A pytest plugin that provides some fixtures for testing Tornado \
apps and handling of plain (undecoratored) native coroutine tests."
LICENSE = "MIT"

PV = "0.6.0.post2"

RPM_NAME = "python311-pytest-tornasync-0.6.0.post2-1.15.noarch.rpm"
RPM_HASH = "1af5099c331bc8f2fb02c5ecdf5c8513549e057a182e635cc0ec2fde807049566b4799a74d15d1d19a2d7935eed8612361462787e4495f0013df91924064e711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-tornasync \
python3.11dist-pytest-tornasync \
python311-pytest-tornasync \
python3dist-pytest-tornasync"

RDEPENDS:${PN} += "python-abi \
python311-base \
python311-pytest \
python311-tornado"

inherit rpm
