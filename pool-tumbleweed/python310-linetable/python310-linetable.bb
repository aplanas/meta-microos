SUMMARY = "library to manage Python Locations Table (co_linetable)"
DESCRIPTION = "library to manage Python Locations Table (co_linetable)"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python310-linetable-0.0.3-1.3.noarch.rpm"
RPM_HASH = "389ea7f13af1d146bd2efa29d46d28c1547ad7a70403ff369a3d52c514fdf73f89e1a06027e51becc7f233e4a461965f7d29a121349c792adca24b35f0b96744"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-linetable \
python310-linetable \
python3dist-linetable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
