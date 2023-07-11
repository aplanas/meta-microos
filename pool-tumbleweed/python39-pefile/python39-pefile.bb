SUMMARY = "A python module to work with PE (pertable executable) files"
DESCRIPTION = "Portable Executable reader module. \
 \
All the PE file basic structures are available with their default names as \
attributes of the instance returned. \
 \
Processed elements such as the import table are made available with lowercase \
names, to differentiate them from the upper case basic structure names. \
 \
pefile has been tested against many edge cases such as corrupted and malformed \
PEs as well as malware, which often attempts to abuse the format way beyond its \
standard use. To the best of my knowledge most of the abuse is handled \
gracefully."
LICENSE = "BSD-3-Clause"

PV = "2023.2.7"

RPM_NAME = "python39-pefile-2023.2.7-2.2.noarch.rpm"
RPM_HASH = "6855ff16787186bdb7335df00b7832b2eb61e8a59f11852644a5e46841d93dc43deb4b5575f04ffa42dd0fc4d19f5a2a23eaf90ff53a3dc988a74dd4d0ca51c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pefile \
python39-pefile \
python3dist-pefile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
