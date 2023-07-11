SUMMARY = "CPython's PEG parser generator"
DESCRIPTION = "CPython's PEG parser generator"
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-pegen-0.2.0-1.4.noarch.rpm"
RPM_HASH = "ebd5fba141123a99a8ac21fd5a667ecf98fa76615cce6e0202041120db4b6f563088c44d39b5a6cbf1e9abd2217ebe7ec7bf61b4a6667a1199e4e7b9f0107446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pegen \
python3.11dist-pegen \
python311-pegen \
python3dist-pegen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
