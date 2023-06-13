SUMMARY = "ASCII art punishment for misspelling git"
DESCRIPTION = "Program which will show you ASCII art car driving across the terminal when you \
misspell git command. After animation it will perform git command as well. \
Similar to sl (steam locomotive)."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "gti-1.8.0-1.3.aarch64.rpm"
RPM_HASH = "bf5c0847284e3fb1b8460f001156f2529953494f6a921836fa77f9bdcdd34dd7bf78c3f8f8b026cebcf18210efbd85c98610f348086b0fd614b96831fa890e81"

RPROVIDES:${PN} += "gti \
gti(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
