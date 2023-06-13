SUMMARY = "Python module for formatting Arabic sentences"
DESCRIPTION = "A module for reconstructing Arabic sentences that are to be used in \
applications that do not support Arabic."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-arabic-reshaper-3.0.0-1.3.noarch.rpm"
RPM_HASH = "57b4f87433c8b758d2fc17415a2b883719280818017a2e4dad3404020e1e07138f7ea0c693fd97cd9a8b3aeb80da4c3194821856d8d0dec859da9c61ee5777e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(arabic-reshaper) \
python39-arabic-reshaper \
python3dist(arabic-reshaper)"

RDEPENDS:${PN} += "python(abi) \
python39-future"

inherit rpm
