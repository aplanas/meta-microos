SUMMARY = "A parser for the perky text file format"
DESCRIPTION = "An 'rcfile' text file format for Python programs solving the same \
problem as 'INI' files, 'TOML' files, and 'JSON' files."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python39-perky-0.5.5-1.4.noarch.rpm"
RPM_HASH = "3484a43fbada761da58290550585a987ca875c73e365dd66c58353f7cb561d24b15cb9bf1883ccd6eaacb11ae473bdf424b91a847e096a45ead19bd5e572a50e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(perky) \
python39-perky \
python3dist(perky)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
