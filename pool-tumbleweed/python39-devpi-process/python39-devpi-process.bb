SUMMARY = "Programmatic API to create and use a devpi server process"
DESCRIPTION = "This package provides a programmatic API to create and use a \
devpi server process."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-devpi-process-0.3.0-1.3.noarch.rpm"
RPM_HASH = "a9f9afdf68ce63aeb5aab50afe2627b58f3547e13ee06cd57302a9c32a6268691443c9f7d7c1a4af6a6fdaa81d56cea82ee1f01b7f73cfec4775e8aa71e82249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-devpi-process \
python39-devpi-process \
python3dist-devpi-process"

RDEPENDS:${PN} += "python-abi \
python39-devpi-client \
python39-devpi-server"

inherit rpm
