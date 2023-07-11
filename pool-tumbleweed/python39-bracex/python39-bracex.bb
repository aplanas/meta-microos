SUMMARY = "Bash style brace expander"
DESCRIPTION = "Bash style brace expander."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python39-bracex-2.2.1-3.3.noarch.rpm"
RPM_HASH = "8d8591601dd3343c3da11e6297853a25543c4734cda9660044e9d8f9066167ce7fdb18b902b294b21f137aace2a4d7e78fe75aa9da6c5e834dcc33f85248c178"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bracex \
python39-bracex \
python3dist-bracex"

RDEPENDS:${PN} += "python-abi"

inherit rpm
