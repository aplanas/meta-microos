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

RPM_NAME = "python39-pefile-2023.2.7-1.2.noarch.rpm"
RPM_HASH = "ded19c8ee2ef5ca455b91abfbdb66e00a84778978a9d6163a9ac8a26cf33dff94744af2a9ee76146b4ed9909fb84bc2db43028eae4dff211d3d6d39c5660ed16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pefile) \
python39-pefile \
python3dist(pefile)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
