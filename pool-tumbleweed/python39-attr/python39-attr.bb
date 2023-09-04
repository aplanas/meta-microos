SUMMARY = "Python module for setting attributes of target functions or classes"
DESCRIPTION = "A decorator to set attributes of target function or class in a DRY way."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python39-attr-0.3.2-2.1.noarch.rpm"
RPM_HASH = "581556bed3b74ce15b1d5a9a5fefe2327dc391e634a96311bf87867a4476447e712e13b91fb985547f24a20c0f632f1ee0aec81e4d07debaf6abf99ffd82d105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-attr \
python39-attr \
python3dist-attr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
