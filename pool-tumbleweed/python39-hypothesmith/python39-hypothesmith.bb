SUMMARY = "Hypothesis strategies for generating Python programs, something like CSmith"
DESCRIPTION = "Hypothesis strategies for generating Python programs, something like CSmith."
LICENSE = "MPL-2.0"

PV = "0.2.3"

RPM_NAME = "python39-hypothesmith-0.2.3-2.3.noarch.rpm"
RPM_HASH = "17f85f9b81905e92c11d039465c6e68da6ffe55261ba47d6f208647c05bf09655ea8445a06b64377780d1fcbb136a31da0dfbf930911ae45dd82a8419935ef01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hypothesmith \
python39-hypothesmith \
python3dist-hypothesmith"

RDEPENDS:${PN} += "python-abi \
python39-base \
python39-hypothesis \
python39-lark \
python39-libcst"

inherit rpm
