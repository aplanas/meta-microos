SUMMARY = "Python bindings of evas"
DESCRIPTION = "Python bindings of the Enlightenment Foundation Libraries (efl)."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.26.0"

RPM_NAME = "python311-efl-1.26.0-2.1.aarch64.rpm"
RPM_HASH = "1b1cf7550e5524077eec0396346a8c927c0c26b92a834a09d7c637853d479533c02678422fff5decfed765d8a12b308d25e3318cad6281601636a7f3d2c6e36b"

RPROVIDES:${PN} += "python3-efl \
python3.11dist-python-efl \
python311-efl \
python3dist-python-efl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libecore-con.so.1 \
libecore-file.so.1 \
libecore-input.so.1 \
libecore-x.so.1 \
libecore.so.1 \
libedje.so.1 \
libeina.so.1 \
libelementary.so.1 \
libemotion.so.1 \
libeo.so.1 \
libethumb-client.so.1 \
libethumb.so.1 \
libevas.so.1 \
python-abi"

inherit rpm
