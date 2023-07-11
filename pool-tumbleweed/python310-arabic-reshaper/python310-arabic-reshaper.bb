SUMMARY = "Python module for formatting Arabic sentences"
DESCRIPTION = "A module for reconstructing Arabic sentences that are to be used in \
applications that do not support Arabic."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-arabic-reshaper-3.0.0-1.5.noarch.rpm"
RPM_HASH = "91e01c80ba6914cee63643bf69b615669fa5f240fd74231c99acf2d54068d50b73a1f96ca0823053ecc39b16dd484fac89f429bdabb068c8c355d6af41c9f3bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-arabic-reshaper \
python310-arabic-reshaper \
python3dist-arabic-reshaper"

RDEPENDS:${PN} += "python-abi \
python310-future"

inherit rpm
