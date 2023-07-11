SUMMARY = "Python Bindings for CUPS"
DESCRIPTION = "Python Bindings for CUPS, the Common Unix Printing System"
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python311-pycups-2.0.1-2.10.aarch64.rpm"
RPM_HASH = "392bf025d950bd816932dae83d4ad9f2c85a6ebe84b1c12ebf7d4650ceb5d0dd3061f1235dfe4398243dfbc81fa4c1818bba1c1ec80357465b4115adf119a03e"

RPROVIDES:${PN} += "python3-cups \
python3-pycups \
python3.11dist-pycups \
python311-cups \
python311-pycups \
python3dist-pycups"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
python-abi"

inherit rpm
