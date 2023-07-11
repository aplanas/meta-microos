SUMMARY = "Data-Driven/Decorated Tests"
DESCRIPTION = "A library to multiply test cases."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python39-ddt-1.6.0-3.3.noarch.rpm"
RPM_HASH = "7c99785e0793a0f489565c521bd02bfe619cb6dc48999c13768e000ab4095ec90b3508b8b7ac19e0e25724b5e8a7e90d25a632e3c8ceb715d6d7449a970efd0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ddt \
python39-ddt \
python3dist-ddt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
