SUMMARY = "A library to provide automatic paging for console output"
DESCRIPTION = "Autopage is a Python library to \
automatically display terminal output from a program \
in a pager (like `less`)"
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python311-autopage-0.5.1-3.3.noarch.rpm"
RPM_HASH = "6d9b6da04a50185fbf74252464fd32f061f3fcdb7ea4ff5cf9d0e79e43fed180b718048f137c73ffb24330a04c10fefa4edaf0fefa1a4ab578c3037351e61dff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(autopage) \
python311-autopage \
python3dist(autopage)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
