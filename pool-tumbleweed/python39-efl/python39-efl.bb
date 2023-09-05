SUMMARY = "Python bindings of evas"
DESCRIPTION = "Python bindings of the Enlightenment Foundation Libraries (efl)."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.26.0"

RPM_NAME = "python39-efl-1.26.0-2.1.aarch64.rpm"
RPM_HASH = "87c46a10f6b6cf838ec8e7a80c09bcc1384cd1db02519e69368bee72d595f6e07937ddecf48b865cfb6195756dd1d192d0ccd544ccf2ddc3e84ae43d464bfc45"

RPROVIDES:${PN} += "python3.9dist-python-efl \
python39-efl \
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
