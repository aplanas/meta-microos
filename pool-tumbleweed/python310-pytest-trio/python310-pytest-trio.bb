SUMMARY = "Pytest plugin for trio"
DESCRIPTION = "This is a pytest plugin to help you test projects that use Trio, \
a friendly library for concurrency and async I/O in Python."
LICENSE = "Apache-2.0 | MIT"

PV = "0.8.0"

RPM_NAME = "python310-pytest-trio-0.8.0-2.3.noarch.rpm"
RPM_HASH = "c82e54cdf31ce9793c742f0f62b7607536163a62e4ed13ad4da391bf6bee39dedbdbf830480f8b60a57366adbf98405531cdcc91a45520270dd9a8957576b865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-trio \
python310-pytest-trio \
python3dist-pytest-trio"

RDEPENDS:${PN} += "python-abi \
python310-contextvars \
python310-outcome \
python310-pytest \
python310-trio"

inherit rpm
