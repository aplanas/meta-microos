SUMMARY = "An Astropy package for photometry"
DESCRIPTION = "Photutils is an affiliated package of Astropy to provide tools for detecting \
and performing photometry of astronomical sources."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "python311-photutils-1.9.0-1.1.aarch64.rpm"
RPM_HASH = "4c48b6f07556efc178277b6931eb0f873d05a0c79adda87956803d59d0bb25005e8f01a90ac9f11ad1051f20fed6258b3163ee6aa04fd11594be174042828999"

RPROVIDES:${PN} += "python3-photutils \
python3.11dist-photutils \
python311-photutils \
python3dist-photutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-astropy \
python311-numpy"

inherit rpm
