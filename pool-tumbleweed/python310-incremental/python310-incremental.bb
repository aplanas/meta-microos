SUMMARY = "Library that versions your Python projects"
DESCRIPTION = "Incremental is a small library that versions your Python projects."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-incremental-22.10.0-2.2.noarch.rpm"
RPM_HASH = "e31209665e64f8ced7f72fb135ef7723cf409eb3f0fd39c3e1b6fd1f46827c44f715d761d1334bc7b32e628d1ffa8feb6fe0f8c2c7e2cdfb1eae5df101c839dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-incremental \
python310-incremental \
python3dist-incremental"

RDEPENDS:${PN} += "python-abi"

inherit rpm
