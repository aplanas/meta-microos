SUMMARY = "A clipboard module for Python"
DESCRIPTION = "A clipboard module for Python. It only handles plain text."
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "python310-pyperclip-1.8.2-2.1.noarch.rpm"
RPM_HASH = "92ab1da229093e67f4c84488444a007ca463ef4629fbfd37ef6f78238d298f453d3a52d27302aac367ccc2a8daa8c7c690b10cd98bb312163ce3a6a6bcb030fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyperclip \
python3.10dist(pyperclip) \
python310-pyperclip \
python3dist(pyperclip)"

RDEPENDS:${PN} += "python(abi) \
xclip \
xsel"

inherit rpm
