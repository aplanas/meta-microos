SUMMARY = "Distribution utilities"
DESCRIPTION = "Python distribution utilities."
LICENSE = "Python-2.0"

PV = "0.3.6"

RPM_NAME = "python311-distlib-0.3.6-2.3.noarch.rpm"
RPM_HASH = "b635036cbd249e6a92e3f8ef1d7e1740249220cdfcc2675415296fe494a1be27e47610b300a36eb1961a132f6034f44a7d31ba9e21f795b27034dea00dfa8019"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-distlib \
python3.11dist-distlib \
python311-distlib \
python3dist-distlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
