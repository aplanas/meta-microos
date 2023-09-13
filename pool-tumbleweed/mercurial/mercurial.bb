SUMMARY = "Scalable Distributed SCM"
DESCRIPTION = "Mercurial is a fast, lightweight source control management system \
designed for efficient handling of very large distributed projects."
LICENSE = "GPL-2.0-or-later"

PV = "6.5.2"

RPM_NAME = "mercurial-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7b38d7ccf9f8d60e80c720cf2398d362060c65f7abb5c64c419e6871b4f388728faf8a5614202d56fc592cf4fa3670a226d5f97d3afbf13ee569cdf6eeb74b50"

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
