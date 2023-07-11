SUMMARY = "A clipboard module for Python"
DESCRIPTION = "A clipboard module for Python. It only handles plain text."
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "python311-pyperclip-1.8.2-2.3.noarch.rpm"
RPM_HASH = "cfd8c834c3a7d4bc9296eeecd1bec465fe6ceb4690744196c6778f73a9c6f9be430f535b032ffc56ce94e7fccf7835a51f3661cd6295c5f7d38a43a494651876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyperclip \
python3.11dist-pyperclip \
python311-pyperclip \
python3dist-pyperclip"

RDEPENDS:${PN} += "python-abi \
xclip \
xsel"

inherit rpm
