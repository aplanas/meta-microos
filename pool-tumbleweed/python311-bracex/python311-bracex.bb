SUMMARY = "Bash style brace expander"
DESCRIPTION = "Bash style brace expander."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python311-bracex-2.2.1-3.1.noarch.rpm"
RPM_HASH = "e0366064ed21b2bda6fe8c8d42a2f92369df77545e81c37ebff7954b256d7cbb60d31e8f471e7f9ebe9527cc9c6916477f758ee762a4ea14a0d91d388cc6fda6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-bracex \
python311-bracex \
python3dist-bracex"

RDEPENDS:${PN} += "python-abi"

inherit rpm
