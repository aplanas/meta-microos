SUMMARY = "Manager for Python libraries' sample data files"
DESCRIPTION = "Pooch manages sample data files for Python libraries. It automatically \
downloads and stores them in a local directory, with support for versioning \
and checks for corruption."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python310-pooch-1.3.0-3.1.noarch.rpm"
RPM_HASH = "a0080d8552acaa5b10ce91652e43ac717dce562ccd2a684d20318f3835d86923c095952aeccde5ce866ed0dd85b72c12e7aa822b67d80309f7be099c15bbe98b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pooch \
python310-pooch \
python3dist-pooch"

RDEPENDS:${PN} += "python-abi \
python310-appdirs \
python310-packaging \
python310-requests"

inherit rpm
