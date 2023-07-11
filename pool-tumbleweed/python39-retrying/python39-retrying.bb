SUMMARY = "Retrying library for Python"
DESCRIPTION = "Retrying is a general-purpose retrying library, written in Python, to \
simplify the task of adding retry behavior to just about anything."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "python39-retrying-1.3.4-1.5.noarch.rpm"
RPM_HASH = "2c752f4fb49c39c8d5da8dfc99299022003a040db41538f5eaf97079759b2c08250e58c325d8371b1544315ad41b8aee599d813c7e6c809a396a533e9f3586cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-retrying \
python39-retrying \
python3dist-retrying"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
