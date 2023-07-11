SUMMARY = "Volatile memory artifact extraction utility framework"
DESCRIPTION = "The Volatility Framework is a collection of tools, implemented in \
Python for the extraction of digital artifacts from volatile memory \
(RAM) samples. The extraction techniques are performed independent of \
the system being investigated but offer visibilty into the runtime \
state of the system."
LICENSE = "BSD-2-Clause-Patent"

PV = "2.0.1"

RPM_NAME = "python38-volatility3-2.0.1-1.5.noarch.rpm"
RPM_HASH = "e026a5764774f5b2e8db897b25877269870d52f46b14418092aa8666ccf711bd405f8ab8a6444595fe571f0fbd988b1a5a26e2a09400506b12fdc607b54819bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-volatility3 \
python38-volatility \
python38-volatility3 \
python3dist-volatility3 \
volatility \
volatility3"

RDEPENDS:${PN} += "/usr/bin/python3 \
capstone \
python-abi \
python3-distorm3 \
python3-pefile \
python3-pycryptodome \
python3-yara"

inherit rpm
