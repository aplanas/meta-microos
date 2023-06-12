SUMMARY = "Scalable Distributed SCM"
DESCRIPTION = "Mercurial is a fast, lightweight source control management system \
designed for efficient handling of very large distributed projects."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.3"

RPM_NAME = "mercurial-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "e7cc1224e42f6ac1e56b50cdf71e961308875cbf9fba084709f0a3dab13184b4055c3418e288aa4c52f61513669634c25e049225e9d417021bc37548371d2566"

RPROVIDES:${PN} += "config(mercurial) \
hg \
mercurial \
mercurial(aarch-64) \
python3.10dist(mercurial) \
python3dist(mercurial)"
RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/wish \
ca-certificates \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
python(abi) \
python3-curses \
python3-xml"

inherit rpm
