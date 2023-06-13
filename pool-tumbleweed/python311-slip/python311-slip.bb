SUMMARY = "Miscellaneous convenience, extension and workaround code for Python"
DESCRIPTION = "The Simple Library for Python packages contain miscellaneous code for \
convenience, extension and workaround purposes. \
 \
This package provides the 'slip' and the 'slip.util' modules."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.5"

RPM_NAME = "python311-slip-0.6.5-6.15.noarch.rpm"
RPM_HASH = "eabe4e518bdabfe16cbabeed32b785782c2154523ca6ddfc4419ac01fc4d2d677cb72f389006875a56777ab1ac69d392e11ddd7d380874de9cb808bd3bcb3c76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(slip) \
python311-slip \
python3dist(slip)"

RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
