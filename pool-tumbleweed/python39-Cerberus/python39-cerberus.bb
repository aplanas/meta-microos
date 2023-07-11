SUMMARY = "Extensible schema and data validation tool for Python dictionaries"
DESCRIPTION = "Cerberus provides type checking and other base functionality out of the box and \
is designed to be non-blocking and extensible, allowing for custom \
validation."
LICENSE = "ISC"

PV = "1.3.2"

RPM_NAME = "python39-Cerberus-1.3.2-6.5.noarch.rpm"
RPM_HASH = "b09cf5f5d720e6a633ef262a5a887b4354d7e04db5a1ae78c0f246367a62e38d26b53905a620eee95459fba7f2398686aa54b430632a93ee2f1d2ed68fe63526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cerberus \
python39-Cerberus \
python3dist-cerberus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
