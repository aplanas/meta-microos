SUMMARY = "Scalable Distributed SCM"
DESCRIPTION = "Mercurial is a fast, lightweight source control management system \
designed for efficient handling of very large distributed projects."
LICENSE = "GPL-2.0-or-later"

PV = "6.5"

RPM_NAME = "mercurial-6.5-1.1.aarch64.rpm"
RPM_HASH = "54cb0f208446c54d0d642b26bd4dd3ca4024d146a6af8643190a964eedb8c76c70d596aa2b524434121830f6ef007f0de627b982717051167b5e23d7392b0347"

RPROVIDES:${PN} += "config-mercurial \
hg \
mercurial \
python3.11dist-mercurial \
python3dist-mercurial"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/wish \
ca-certificates \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3-curses \
python3-xml"

inherit rpm
