SUMMARY = "Interactive data selection cursors for Matplotlib"
DESCRIPTION = "mplcursors provides interactive data selection cursors for Matplotlib."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python310-mplcursors-0.5.2-1.5.noarch.rpm"
RPM_HASH = "7f796259e22ade92bba5d566ad782109ab10f426e47b73bb5496680e0f0428d3f6848d09cfbe103fa8bebe1d1d748ae0ef01b317ff3400eaa1badd6fe7435131"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mplcursors \
python310-mplcursors \
python3dist-mplcursors"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib"

inherit rpm
