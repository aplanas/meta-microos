SUMMARY = "A parsing library for Python"
DESCRIPTION = "Lark is a general-purpose parsing library for Python. \
 \
With Lark, one can parse any context-free grammar with little code."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "python39-lark-1.1.5-2.3.noarch.rpm"
RPM_HASH = "dd36028682117a0e7f7182d42ea5185726dcf7def2f58903df05deb817071fd43634b5f82a383c7460baca177a26be0b8d6079ed55ee778785080160c5aa4cda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lark \
python39-lark \
python39-lark-parser \
python3dist-lark"

RDEPENDS:${PN} += "python-abi"

inherit rpm
