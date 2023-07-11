SUMMARY = "Git Object Database"
DESCRIPTION = "GitDB is a pure-Python git object database"
LICENSE = "BSD-3-Clause"

PV = "4.0.10"

RPM_NAME = "python39-gitdb-4.0.10-2.3.aarch64.rpm"
RPM_HASH = "29f1722e475a96d40d628ec54317c2e81029b09e9ef8b55180780a0ef4439e446630eef35492d14a0f6d696ee09a9efd8599f2e73895cf09d0ac163a7be05dc6"

RPROVIDES:${PN} += "python3.9dist-gitdb \
python39-gitdb \
python39-gitdb2 \
python3dist-gitdb"

RDEPENDS:${PN} += "python-abi \
python39-smmap"

inherit rpm
