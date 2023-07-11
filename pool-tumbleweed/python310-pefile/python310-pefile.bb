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

RPM_NAME = "python310-pefile-2023.2.7-2.2.noarch.rpm"
RPM_HASH = "0624513d807d14d1e92b6918880693fd2f017994b9618c6ff491dda596b3a45539fd7fae91d77d9392072883c1a87d3ecad8b9f3825a1d2f63357c4414046da9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pefile \
python310-pefile \
python3dist-pefile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
