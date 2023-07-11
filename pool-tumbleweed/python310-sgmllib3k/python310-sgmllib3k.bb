SUMMARY = "Python 3 port of sgmllib"
DESCRIPTION = "Python 3 port of Python 2's standard library `sgmllib`."
LICENSE = "BSD-3-Clause & Python-2.0"

PV = "1.0.0"

RPM_NAME = "python310-sgmllib3k-1.0.0-5.1.noarch.rpm"
RPM_HASH = "88213f8e489575a264a4e60565f20da365aeb9dff5262b313a123a53a4c008f0bce691f1460086c4561197e5339b5ee265f4b7262534bb9eb065fd5cf82b60e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sgmllib3k \
python310-sgmllib3k \
python3dist-sgmllib3k"

RDEPENDS:${PN} += "python-abi"

inherit rpm
