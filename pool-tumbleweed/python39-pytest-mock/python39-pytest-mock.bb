SUMMARY = "Thin-wrapper around the mock package for easier use with pytest"
DESCRIPTION = "This plugin installs a ``mocker`` fixture which is a thin-wrapper around the patching API \
provided by the `mock` package, but with the benefit of not having to worry about undoing \
patches at the end of a test"
LICENSE = "MIT"

PV = "3.10.0"

RPM_NAME = "python39-pytest-mock-3.10.0-2.1.noarch.rpm"
RPM_HASH = "a253e94c941722dc884eefe3d030de05f7b97ea53926672605f9d4c674963fecc0650f8757341f31e7f1d6627a40fdad7e5721c83a01a00418d56cd176ab02a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-mock) \
python39-pytest-mock \
python3dist(pytest-mock)"
RDEPENDS:${PN} += "python(abi) \
python39-py \
python39-pytest"

inherit rpm
