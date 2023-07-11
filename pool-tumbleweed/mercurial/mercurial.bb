SUMMARY = "Scalable Distributed SCM"
DESCRIPTION = "Mercurial is a fast, lightweight source control management system \
designed for efficient handling of very large distributed projects."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.4"

RPM_NAME = "mercurial-6.4.4-1.2.aarch64.rpm"
RPM_HASH = "04abcb6c8287286418a95a1f1d8a76747eca197700759ca607e12d5a009514c10a4d65299fca11956d8af8918a765618d405cb5d74a9ba376aaa10400c3ef966"

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
