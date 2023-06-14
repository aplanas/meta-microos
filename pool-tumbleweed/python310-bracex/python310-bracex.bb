SUMMARY = "Bash style brace expander"
DESCRIPTION = "Bash style brace expander."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python310-bracex-2.2.1-3.1.noarch.rpm"
RPM_HASH = "f80368c2d99ca8d1f69b8cc50e2d8d43499da9560e0704161867cf5f216abb48a34d6ba7c348cdcd9ab3d6a96f06b00186e59236dcc5e232a4dd3388e7939c0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bracex \
python3.10dist-bracex \
python310-bracex \
python3dist-bracex"

RDEPENDS:${PN} += "python-abi"

inherit rpm
