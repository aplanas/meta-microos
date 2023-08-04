SUMMARY = "Python module to use libmagic"
DESCRIPTION = "This package contains the Python binding that require the magic 'file' \
interface."
LICENSE = "BSD-3-Clause & BSD-4-Clause"

PV = "5.45"

RPM_NAME = "python311-magic-5.45-1.1.aarch64.rpm"
RPM_HASH = "460546f1d5fa77a8b061d49e562863d31d82b58f2a567f8e1cd1b957523022658deedc4d4fa02bcb9e96886f60cb421c1f33aa41728c241d098490457a88aa30"

RPROVIDES:${PN} += "python3-file-magic \
python3-magic \
python3.11dist-file-magic \
python311-file-magic \
python311-magic \
python3dist-file-magic"

RDEPENDS:${PN} += "libmagic1 \
python-abi"

inherit rpm
