SUMMARY = "Python module for formatting Arabic sentences"
DESCRIPTION = "A module for reconstructing Arabic sentences that are to be used in \
applications that do not support Arabic."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-arabic-reshaper-3.0.0-2.1.noarch.rpm"
RPM_HASH = "fe8479c8f9c276313af7b59adfc38c58cd31c56ca613f2db95b5badeb061a6f099d16da1876738dbaddde479daa2e1f980f23913d369e46256e4b5930899b8fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-arabic-reshaper \
python3.11dist-arabic-reshaper \
python311-arabic-reshaper \
python3dist-arabic-reshaper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
