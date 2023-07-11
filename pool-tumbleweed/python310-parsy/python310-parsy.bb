SUMMARY = "Python parser combinators"
DESCRIPTION = "Easy-to-use parser combinators, for parsing in pure Python."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-parsy-1.3.0-1.9.noarch.rpm"
RPM_HASH = "a6672b75fb5c17eac01d3977c973bac76e037f5699053c9be19e90dc23cd253fdfda9f9baaf6da5f0cf72b91f0a59232f414c7d03168fc1e56ec6bf09945f385"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-parsy \
python310-parsy \
python3dist-parsy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
