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

RPM_NAME = "python311-pefile-2023.2.7-1.2.noarch.rpm"
RPM_HASH = "af86b0568f229ea3e2971f857ac665554f8953dcbc3e28c66f09a0bece6ca9380ed60bb1d7c46845e52875b7439a290671288b7d44f2cae90f629248d2b2d6c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pefile \
python311-pefile \
python3dist-pefile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
