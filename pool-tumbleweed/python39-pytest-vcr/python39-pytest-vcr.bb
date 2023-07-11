SUMMARY = "Plugin for managing VCR.py cassettes"
DESCRIPTION = "Plugin for managing VCR.py cassettes."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python39-pytest-vcr-1.0.2-2.3.noarch.rpm"
RPM_HASH = "c0895f852f9f7f8de214182c9fdb21c3c088dd2206ad3168911f53006268c5f280a0ef12bd276e61d4e3458a1affdc674889a8b238a05ed686a4a9e398ce727c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-vcr \
python39-pytest-vcr \
python3dist-pytest-vcr"

RDEPENDS:${PN} += "python-abi \
python39-pytest \
python39-vcrpy"

inherit rpm
