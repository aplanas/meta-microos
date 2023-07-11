SUMMARY = "Classes for Python Virtual Environments"
DESCRIPTION = "Classes for orchestrating Python (virtual) environments."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python310-jaraco.envs-2.4.0-3.3.noarch.rpm"
RPM_HASH = "7634fe7e0baefda17d8e3e16a7afce294bf9bed01f31f26862e8575b474fc1120f63d7b59f3fde4cb8c6c3fe940804a2aeabd1097604059e778c6633c51cd887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jaraco.envs \
python310-jaraco.envs \
python3dist-jaraco.envs"

RDEPENDS:${PN} += "python-abi \
python310-path \
python310-virtualenv"

inherit rpm
