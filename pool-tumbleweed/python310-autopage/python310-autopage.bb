SUMMARY = "A library to provide automatic paging for console output"
DESCRIPTION = "Autopage is a Python library to \
automatically display terminal output from a program \
in a pager (like `less`)"
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python310-autopage-0.5.1-3.5.noarch.rpm"
RPM_HASH = "210ae76e19726573503bd4b05166bdf7b112ffddcfdc6b1f847eaf20ec075eadd68a297f84275c69d78e3eae5e85ad96b630af6165456bff31d20697172455de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-autopage \
python310-autopage \
python3dist-autopage"

RDEPENDS:${PN} += "python-abi"

inherit rpm
