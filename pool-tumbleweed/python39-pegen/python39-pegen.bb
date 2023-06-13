SUMMARY = "CPython's PEG parser generator"
DESCRIPTION = "CPython's PEG parser generator"
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-pegen-0.2.0-1.2.noarch.rpm"
RPM_HASH = "cd1ac7a0c540ca938eb665d76ff2b7ec4c6eed6d40dfa0ab1e3cb79621fb28f34e8920d52364374b3f9131213d63687853461460e32022c43832d93653a129ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pegen) \
python39-pegen \
python3dist(pegen)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
