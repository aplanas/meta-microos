SUMMARY = "Manager for Python libraries' sample data files"
DESCRIPTION = "Pooch manages sample data files for Python libraries. It automatically \
downloads and stores them in a local directory, with support for versioning \
and checks for corruption."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python39-pooch-1.3.0-3.1.noarch.rpm"
RPM_HASH = "f3b4a896c5a421d44505f2cd9f8363d6c03cc630661e46a769bf7ed71166e1e5abe397351b8f88afdba4e8a2234fc0219af93f5f75ea5924535192915874475a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pooch \
python39-pooch \
python3dist-pooch"

RDEPENDS:${PN} += "python-abi \
python39-appdirs \
python39-packaging \
python39-requests"

inherit rpm
