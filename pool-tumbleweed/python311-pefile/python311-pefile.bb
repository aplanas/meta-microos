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

RPM_NAME = "python311-pefile-2023.2.7-2.2.noarch.rpm"
RPM_HASH = "c3ed40b4a56f8fe71ef0a93fef55274a3f012baddf49f3ea6698612d0a51966ac3d4b9cfc13ce93d50744145a622c44c28d6d8c9dd1356555fd072e78b28c968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pefile \
python3.11dist-pefile \
python311-pefile \
python3dist-pefile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
