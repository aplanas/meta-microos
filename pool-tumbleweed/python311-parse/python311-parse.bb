SUMMARY = "Python module for parsing strings using a 'format' syntax"
DESCRIPTION = "Parse strings using a specification based on the Python format() syntax."
LICENSE = "MIT"

PV = "1.19.0"

RPM_NAME = "python311-parse-1.19.0-1.10.noarch.rpm"
RPM_HASH = "1ca72f28053b31733fb4e7bbae34ee77d0d53690af3f2a319d197af9a30db765d4347c08e1b42f7d69ad78fb89ff3e312c7e83a8b110886f0e4de0bc9df5d85b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-parse \
python311-parse \
python3dist-parse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
