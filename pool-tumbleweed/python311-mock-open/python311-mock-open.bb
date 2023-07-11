SUMMARY = "A better mock for file I/O"
DESCRIPTION = "A better mock for file I/O"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python311-mock-open-1.4.0-2.12.noarch.rpm"
RPM_HASH = "b75413d071eb3e351e07637eff4e79d4989933285ad0eda9603852584151838b3f96470f06f29bf6b230c2515c18122285ddd480f8ebfe102eedd1aba7412320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mock-open \
python3.11dist-mock-open \
python311-mock-open \
python3dist-mock-open"

RDEPENDS:${PN} += "python-abi"

inherit rpm
