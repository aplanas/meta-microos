SUMMARY = "Python binding to the wayland library using cffi"
DESCRIPTION = "Python binding to the wayland library using cffi."
LICENSE = "NCSA"

PV = "0.4.15"

RPM_NAME = "python311-pywayland-0.4.15-1.5.aarch64.rpm"
RPM_HASH = "b4b7c716c66be22275003c604fdf355de84ddd2aa00490e594d98282e28c77b17d16031267234d72c622de89c256cb19d43f517b769a806ce1d458ffa4f57859"

RPROVIDES:${PN} += "python3-pywayland \
python3.11dist-pywayland \
python311-pywayland \
python3dist-pywayland"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0 \
python-abi \
update-alternatives"

inherit rpm
