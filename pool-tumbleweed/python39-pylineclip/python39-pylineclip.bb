SUMMARY = "Line clipping tool"
DESCRIPTION = "Line clipping: Cohen-Sutherland"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-pylineclip-1.0.0-2.10.noarch.rpm"
RPM_HASH = "9cdbb08ea4a69256060e01f2adfb070dc6d9990b5f1c89a9787d5b3072f0c921fcb21582bbac5587abfdedbd5806b8cec50fe91f3857f70890f4a2410ac2e75a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pylineclip \
python39-pylineclip \
python3dist-pylineclip"

RDEPENDS:${PN} += "python-abi"

inherit rpm
