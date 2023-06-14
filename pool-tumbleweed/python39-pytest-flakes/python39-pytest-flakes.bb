SUMMARY = "Pytest plugin to check source code with pyflakes"
DESCRIPTION = "py.test plugin for efficiently checking python source with pyflakes."
LICENSE = "MIT"

PV = "4.0.5"

RPM_NAME = "python39-pytest-flakes-4.0.5-1.6.noarch.rpm"
RPM_HASH = "f816defe6f5a31d40fab29b5424564e22e02656d33e140e54d0a3d512bfc52390d0a6bb53d68f0dec11a2d28f4123dc6efc8fa58ac16ee89d2ca97025fd4a2a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-flakes \
python39-pytest-flakes \
python3dist-pytest-flakes"

RDEPENDS:${PN} += "python-abi \
python39-pyflakes \
python39-pytest"

inherit rpm
