SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-x86_64-gcc13-icecream-backend-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "6dbd3c24e3bb6fd6edcb5c5f2094c65c5bdf2b860438da83c96853fd2cb03c5a87839a2cd89171e43067c1cc5d48b6dfa83a9261ed3f3c25ab496df6308de83d"

RPROVIDES:${PN} += "cross-x86_64-gcc13-icecream-backend cross-x86_64-gcc13-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
