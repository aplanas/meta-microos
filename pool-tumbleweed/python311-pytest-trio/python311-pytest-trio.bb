SUMMARY = "Pytest plugin for trio"
DESCRIPTION = "This is a pytest plugin to help you test projects that use Trio, \
a friendly library for concurrency and async I/O in Python."
LICENSE = "Apache-2.0 | MIT"

PV = "0.8.0"

RPM_NAME = "python311-pytest-trio-0.8.0-2.3.noarch.rpm"
RPM_HASH = "dc5128562b0be31328cc9bcea560c3c87f24a81ebddb12433706301ebd229ca7b1d7635aad7901a78fabb19ee5188400118ba3f77c871ca1eda75985bcae4456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-trio \
python3.11dist-pytest-trio \
python311-pytest-trio \
python3dist-pytest-trio"

RDEPENDS:${PN} += "python-abi \
python311-contextvars \
python311-outcome \
python311-pytest \
python311-trio"

inherit rpm
