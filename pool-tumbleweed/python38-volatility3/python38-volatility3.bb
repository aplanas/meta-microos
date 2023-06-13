SUMMARY = "Volatile memory artifact extraction utility framework"
DESCRIPTION = "The Volatility Framework is a collection of tools, implemented in \
Python for the extraction of digital artifacts from volatile memory \
(RAM) samples. The extraction techniques are performed independent of \
the system being investigated but offer visibilty into the runtime \
state of the system."
LICENSE = "BSD-2-Clause-Patent"

PV = "2.0.1"

RPM_NAME = "python38-volatility3-2.0.1-1.4.noarch.rpm"
RPM_HASH = "892c59588c975f7470a94592a73fa54a746d5914bc75803f9478b0235aa84dc51bad164d22412b188c87b135234415192aff06ee370e67e8b97608a9ca09322f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(volatility3) \
python38-volatility \
python38-volatility3 \
python3dist(volatility3) \
volatility \
volatility3"

RDEPENDS:${PN} += "/usr/bin/python3 \
capstone \
python(abi) \
python3-distorm3 \
python3-pefile \
python3-pycryptodome \
python3-yara"

inherit rpm
