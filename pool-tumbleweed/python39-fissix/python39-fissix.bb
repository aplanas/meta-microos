SUMMARY = "Backport of lib2to3, with enhancements"
DESCRIPTION = "Backport of latest lib2to3, with enhancements."
LICENSE = "Python-2.0"

PV = "21.11.13"

RPM_NAME = "python39-fissix-21.11.13-1.17.noarch.rpm"
RPM_HASH = "b873f837e0ed3fe44cc823e7f2b38b84cc102ec4c2c0dfe102f4e18489c12bb785db1ea819c44d465e417ba5e54684d33b05db85252ff3eec6e82297af0f2526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fissix \
python39-fissix \
python3dist-fissix"

RDEPENDS:${PN} += "python-abi \
python39-appdirs"

inherit rpm
