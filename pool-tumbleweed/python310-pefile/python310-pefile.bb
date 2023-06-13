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

RPM_NAME = "python310-pefile-2023.2.7-1.2.noarch.rpm"
RPM_HASH = "322e8b925c377742bbc7084f8dfbceef9a6b9ba16cd3c1592ee90b9f44111591d3b74a94969929a5613cebac204457436e901acbee4b4a89c97d5b347cc394ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pefile \
python3.10dist(pefile) \
python310-pefile \
python3dist(pefile)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
