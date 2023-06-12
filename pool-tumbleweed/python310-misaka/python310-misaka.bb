SUMMARY = "A CFFI binding for Hoedown, a markdown parsing library"
DESCRIPTION = "A CFFI binding for Hoedown_ (version 3), a markdown parsing library."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python310-misaka-2.1.1-2.17.aarch64.rpm"
RPM_HASH = "ddaed4863d678e46815d601a14a123c749f4e473932f62a489794a847d50854c9541605748b30f9199dc2caf576422121951a474e52c27f7f6da760119abef70"

RPROVIDES:${PN} += "python3-misaka \
python3.10dist(misaka) \
python310-misaka \
python310-misaka(aarch-64) \
python3dist(misaka)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-cffi \
update-alternatives"

inherit rpm