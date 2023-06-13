SUMMARY = "Support multiple formats with ease"
DESCRIPTION = "Formats will provide you with a consistent API to parse and compose data."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-formats-0.1.1-1.14.noarch.rpm"
RPM_HASH = "6d917016ddacd5fc39e699cfb13853b1207d3be6339127eb98ba251988547aed0396fd44147042346a4aa8f06e24e395292199521b77cba55b76c4caaaa7457b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(formats) \
python39-formats \
python3dist(formats)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
