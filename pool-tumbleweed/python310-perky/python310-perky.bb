SUMMARY = "A parser for the perky text file format"
DESCRIPTION = "An 'rcfile' text file format for Python programs solving the same \
problem as 'INI' files, 'TOML' files, and 'JSON' files."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python310-perky-0.5.5-1.4.noarch.rpm"
RPM_HASH = "74dc7252ae04740237a1a614b987d571a0b89d378c8a00df5cfe5d24ace40d6081873561db10653fa7ae6c47c7aff2277031a41ff1568c95c66c8d6237274b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-perky \
python3.10dist(perky) \
python310-perky \
python3dist(perky)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
