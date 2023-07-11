SUMMARY = "A parsing library for Python"
DESCRIPTION = "Lark is a general-purpose parsing library for Python. \
 \
With Lark, one can parse any context-free grammar with little code."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "python310-lark-1.1.5-2.3.noarch.rpm"
RPM_HASH = "43d0030fd987b60e7844e7a51a2edee604ac4b297d3dea91c005956f2a3b3cbb3352361d67c81667535856afa6d467b32e046619758bd0bf7141086ee4956802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-lark \
python310-lark \
python310-lark-parser \
python3dist-lark"

RDEPENDS:${PN} += "python-abi"

inherit rpm
