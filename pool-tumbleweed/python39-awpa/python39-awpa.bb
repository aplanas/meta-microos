SUMMARY = "A Working Python AST"
DESCRIPTION = "A Working Python AST."
LICENSE = "Python-2.0 & MIT"

PV = "0.19.1.0"

RPM_NAME = "python39-awpa-0.19.1.0-1.20.noarch.rpm"
RPM_HASH = "6e8740938748a740e7528212f3e16fa46b6ea296db86f65b6076704525663eff8e4bdbe293fe1e92504b67ca7f287032bc67d81d50ef85743948d7937d8506cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-awpa \
python39-awpa \
python3dist-awpa"

RDEPENDS:${PN} += "python-abi"

inherit rpm
