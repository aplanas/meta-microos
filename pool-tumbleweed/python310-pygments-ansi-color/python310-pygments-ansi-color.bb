SUMMARY = "ANSI color-code highlighting for Pygments"
DESCRIPTION = "An ANSI color-code highlighting lexer for Pygments."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python310-pygments-ansi-color-0.2.0-1.3.noarch.rpm"
RPM_HASH = "6ea8b0256dcbb7cd4a03320a42b0407e0dfc4b2c2baa45321c52f92ad23b011fc99aff5ee2830eeaf62eddccef7fab5415e789ebf627691b4a81deafe8b82073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pygments-ansi-color \
python310-pygments-ansi-color \
python3dist-pygments-ansi-color"

RDEPENDS:${PN} += "python-abi \
python310-pygments \
python310-setuptools"

inherit rpm
