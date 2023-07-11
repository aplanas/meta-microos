SUMMARY = "A clipboard module for Python"
DESCRIPTION = "A clipboard module for Python. It only handles plain text."
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "python310-pyperclip-1.8.2-2.3.noarch.rpm"
RPM_HASH = "a9645fa58a7c911e18ea5491c31a96a29463bf9d1de62dae5595bc7d6116b5ab4400bd7225605f8607e34ed29eb57daf17f24576f7fb55da1b6026d5628e8083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyperclip \
python310-pyperclip \
python3dist-pyperclip"

RDEPENDS:${PN} += "python-abi \
xclip \
xsel"

inherit rpm
