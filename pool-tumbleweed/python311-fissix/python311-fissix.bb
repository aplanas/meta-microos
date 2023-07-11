SUMMARY = "Backport of lib2to3, with enhancements"
DESCRIPTION = "Backport of latest lib2to3, with enhancements."
LICENSE = "Python-2.0"

PV = "21.11.13"

RPM_NAME = "python311-fissix-21.11.13-1.17.noarch.rpm"
RPM_HASH = "ceb1c4a5f95f8bf03963b2dacd19c1f55eeb95cf1208b985e72f72076f619fdb46ba4b868fe36820305a9bdd5ee3babca5500c9594512570d64701d6949f0b29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fissix \
python3.11dist-fissix \
python311-fissix \
python3dist-fissix"

RDEPENDS:${PN} += "python-abi \
python311-appdirs"

inherit rpm
