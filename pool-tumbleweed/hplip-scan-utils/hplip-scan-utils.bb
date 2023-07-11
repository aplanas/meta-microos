SUMMARY = "HPLIP scanning frontends hp-scan and hp-uiscan"
DESCRIPTION = "This package provides the 'hp-scan' and 'hp-uiscan' frontend utilities. These \
utilities are alternatives to the SANE frontends 'xsane' and 'scanimage'. They \
expose some advanced features of certain HP scanner models."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.22.10"

RPM_NAME = "hplip-scan-utils-3.22.10-2.3.aarch64.rpm"
RPM_HASH = "436565a1f497d9b10d34e3721ca0e8497308aeb35e9ff8658fe649a06a12fb2184dfd4f53b13d2e7ab0235b8705379011d0466d1ffaca6855fef7571f3e6e9f4"

RPROVIDES:${PN} += "hplip-scan \
hplip-scan-utils"

RDEPENDS:${PN} += "/usr/bin/python3 \
hplip \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsane.so.1 \
python-abi \
python3-Pillow \
python3-scikit-image"

inherit rpm
