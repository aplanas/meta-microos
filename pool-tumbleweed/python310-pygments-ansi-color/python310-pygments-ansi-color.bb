SUMMARY = "ANSI color-code highlighting for Pygments"
DESCRIPTION = "An ANSI color-code highlighting lexer for Pygments."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python310-pygments-ansi-color-0.2.0-1.1.noarch.rpm"
RPM_HASH = "9ce19795ce8bdfd282c6df1c57b7aa4b15df4024d79c64325eceb993ca1dce160fff01ccc61e81924f41d32f5e2c2bef6f421589bcba937cbea2b6a10f668027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygments-ansi-color \
python3.10dist-pygments-ansi-color \
python310-pygments-ansi-color \
python3dist-pygments-ansi-color"

RDEPENDS:${PN} += "python-abi \
python310-pygments \
python310-setuptools"

inherit rpm
