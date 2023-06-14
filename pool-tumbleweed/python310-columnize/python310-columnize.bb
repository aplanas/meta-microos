SUMMARY = "Format a simple (i.e. not nested) list into aligned columns"
DESCRIPTION = "Format a simple (i.e. not nested) list into aligned columns."
LICENSE = "MIT"

PV = "0.3.11"

RPM_NAME = "python310-columnize-0.3.11-1.6.noarch.rpm"
RPM_HASH = "fafdf0173113f8b15d8f1f30084cd0874f97db1ea74155d299a4348e5e265a8e7810971ab0c355b381dfcf5e4a33d98e796d884cec04442def41e39c7134abab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-columnize \
python3.10dist-columnize \
python310-columnize \
python3dist-columnize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
