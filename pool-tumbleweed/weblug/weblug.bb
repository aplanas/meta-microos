SUMMARY = "Simple webhook receiver program"
DESCRIPTION = "Simple webhook receiver program"
LICENSE = "MIT"

PV = "0.3"

RPM_NAME = "weblug-0.3-1.1.aarch64.rpm"
RPM_HASH = "c281db43c8cbfb9cb154311f128e1ae598c1005a349bb065188104c86efbc55f64bd3a84db1162e8ea1a8885513babd9ee6a7c23a31c3f6c01cccacdf51c5136"

RPROVIDES:${PN} += "config(weblug) \
weblug \
weblug(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
