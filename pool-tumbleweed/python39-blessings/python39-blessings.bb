SUMMARY = "A thin, practical wrapper around terminal capabilities in Python"
DESCRIPTION = "Curses-like terminal wrapper with a display based on compositing 2d \
arrays of text."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python39-blessings-1.7-3.3.noarch.rpm"
RPM_HASH = "a894501495dc0c63fe78fe51673bb493f5f92ecdf269fa661da19481d760a2d3816e932d66872efc4eaffe90b3e8d121c0839430208e5ce59252a0a8525ff09d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-blessings \
python39-blessings \
python3dist-blessings"

RDEPENDS:${PN} += "python-abi \
python39-curses \
python39-six"

inherit rpm
