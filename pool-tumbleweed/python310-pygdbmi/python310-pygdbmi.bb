SUMMARY = "Parse gdb machine interface output with Python"
DESCRIPTION = "Parse gdb machine interface output with Python"
LICENSE = "MIT"

PV = "0.11.0.0"

RPM_NAME = "python310-pygdbmi-0.11.0.0-1.1.noarch.rpm"
RPM_HASH = "37819f86ac3802c81284976bfc90fb65a1ff160c0d2af1e8e4a99c62ba28176e332cfef61d499c60565c2c7e6f64d37a6c2300f7385d700a26ea7a66ea21d71b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pygdbmi \
python310-pygdbmi \
python3dist-pygdbmi"

RDEPENDS:${PN} += "python-abi"

inherit rpm
