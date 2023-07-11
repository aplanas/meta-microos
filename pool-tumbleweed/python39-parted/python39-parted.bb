SUMMARY = "Python module for GNU parted"
DESCRIPTION = "Python module for the parted library.  It is used for manipulating \
partition tables."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.0"

RPM_NAME = "python39-parted-3.12.0-3.3.aarch64.rpm"
RPM_HASH = "a9af590663c7065a60775cacb00c5361d299bc6933386199fbdca46071bdea6e255b6a50aee4838d4729cc54b579ca6b5fe1e8357964b7fad82c2eeac8d40ed4"

RPROVIDES:${PN} += "python3.9dist-pyparted \
python39-parted \
python3dist-pyparted"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libparted.so.2 \
parted \
python-abi"

inherit rpm
