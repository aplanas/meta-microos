SUMMARY = "Pytest plugin for trio"
DESCRIPTION = "This is a pytest plugin to help you test projects that use Trio, \
a friendly library for concurrency and async I/O in Python."
LICENSE = "Apache-2.0 | MIT"

PV = "0.8.0"

RPM_NAME = "python39-pytest-trio-0.8.0-2.1.noarch.rpm"
RPM_HASH = "76fd6dcb21546f2e7a828ea25a5495566a370853983285d842f15fcd258d00aa49e962a779b82e26f70f4c33bd83fad6a2877988e1d4119bcd705a4d3bea483a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-trio) \
python39-pytest-trio \
python3dist(pytest-trio)"

RDEPENDS:${PN} += "python(abi) \
python39-contextvars \
python39-outcome \
python39-pytest \
python39-trio"

inherit rpm
