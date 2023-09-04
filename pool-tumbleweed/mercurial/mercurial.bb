SUMMARY = "Scalable Distributed SCM"
DESCRIPTION = "Mercurial is a fast, lightweight source control management system \
designed for efficient handling of very large distributed projects."
LICENSE = "GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "mercurial-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "fbd0db7e1db776f3b0976262e5f380902556c1805fc91aa432168ffa966daa90d36a6c85a12065e780593d66f8be32065c554efb98c107fded8f0fd57264cc65"

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
