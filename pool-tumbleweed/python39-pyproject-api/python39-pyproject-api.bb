SUMMARY = "API to interact with the python pyproject.toml based projects"
DESCRIPTION = "pyproject-api aims to abstract away interaction with \
pyproject.toml style projects in a flexible way."
LICENSE = "MIT"

PV = "1.5.4"

RPM_NAME = "python39-pyproject-api-1.5.4-1.1.noarch.rpm"
RPM_HASH = "2673447fc476ad30bccdcb7aaf8474b8b80af09c8d44aa689ceb1bf1406d9654b162a49b07fb5d4bf751c6a600756222c632c122fd42e2ac9cc4682f015d5643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyproject-api \
python39-pyproject-api \
python3dist-pyproject-api"

RDEPENDS:${PN} += "python-abi \
python39-packaging"

inherit rpm
