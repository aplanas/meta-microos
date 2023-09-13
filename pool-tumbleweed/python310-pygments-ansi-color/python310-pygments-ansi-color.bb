SUMMARY = "ANSI color-code highlighting for Pygments"
DESCRIPTION = "An ANSI color-code highlighting lexer for Pygments."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python310-pygments-ansi-color-0.3.0-1.1.noarch.rpm"
RPM_HASH = "ba71a82bc839aa279c343312c67fd87022fd19d0172601fd233dc1290c9fb8e8c35e4d8bc17d624ba28439b8f7c3266c32c2e969d04320545e65ffe2ea3a7def"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pygments-ansi-color \
python310-pygments-ansi-color \
python3dist-pygments-ansi-color"

RDEPENDS:${PN} += "python-abi \
python310-pygments \
python310-setuptools"

inherit rpm
