SUMMARY = "Miscellaneous convenience, extension and workaround code for Python"
DESCRIPTION = "The Simple Library for Python packages contain miscellaneous code for \
convenience, extension and workaround purposes. \
 \
This package provides the 'slip' and the 'slip.util' modules."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.5"

RPM_NAME = "python39-slip-0.6.5-6.16.noarch.rpm"
RPM_HASH = "efca8d7e3fc876a4a5380c3d4f33894f956cda81e7fd236fe99a5d87b6a351dd86b39def321432d2846cdcb2cba3f96e709cb031dca072cf14c5b7a8219b7238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-slip \
python39-slip \
python3dist-slip"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
