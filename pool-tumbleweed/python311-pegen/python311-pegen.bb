SUMMARY = "CPython's PEG parser generator"
DESCRIPTION = "CPython's PEG parser generator"
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-pegen-0.2.0-1.2.noarch.rpm"
RPM_HASH = "1cde29f68cf18860c9e93108831a91813186fad85741f747f552ba9db85749c1b9e056e1c9eefbf76c47810d3589864bac12ed178762e8e1eb1082f5a4689130"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pegen) \
python311-pegen \
python3dist(pegen)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
