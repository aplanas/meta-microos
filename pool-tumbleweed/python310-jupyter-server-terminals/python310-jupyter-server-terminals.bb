SUMMARY = "A Jupyter Server Extension Providing Terminals"
DESCRIPTION = "A Jupyter Server Extension Providing Terminals."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python310-jupyter-server-terminals-0.4.4-1.3.noarch.rpm"
RPM_HASH = "238ea918f0469ab2ecdfec5f01d46954422532227a0f747ffa0eefa04ce46f2be98f6f421cbb03ef3365169b665d65fecd9bce4afaeaafcbcd4f270f224371ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-server-terminals \
python3.10dist-jupyter-server-terminals \
python310-jupyter-server-terminals \
python3dist-jupyter-server-terminals"

RDEPENDS:${PN} += "jupyter-server-terminals \
python-abi \
python310-terminado"

inherit rpm
