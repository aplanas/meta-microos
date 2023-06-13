SUMMARY = "Demos for saxon8"
DESCRIPTION = "Demonstrations and samples for saxon8."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-demo-B.8.8-133.6.noarch.rpm"
RPM_HASH = "1ba38cd69023af01383c3f4484c4e4a82c4c660d2a79cd00125b39f6fd91bad0399f4d3d48ae244e157123a450073780f8ee119cef8f47e0b4d731e949ea0490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon8-demo"

RDEPENDS:${PN} += "saxon8"

inherit rpm
