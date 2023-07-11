SUMMARY = "A library to provide automatic paging for console output"
DESCRIPTION = "Autopage is a Python library to \
automatically display terminal output from a program \
in a pager (like `less`)"
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python39-autopage-0.5.1-3.5.noarch.rpm"
RPM_HASH = "8c8ed5273ee2b0aba09c910735fb45e93ba4bd1c64c14678bad0f92385172232dbbf7de25f80482410d7dacc6b53e099009a7630cb1d027a3297da22557a1bcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-autopage \
python39-autopage \
python3dist-autopage"

RDEPENDS:${PN} += "python-abi"

inherit rpm
