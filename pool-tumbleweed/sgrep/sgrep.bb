SUMMARY = "Searching for Structured Patterns"
DESCRIPTION = "Sgrep is like 'grep' but it will also work for structured patterns. You can \
use the program to extract fragments from SGML/XML or any other well formed \
text files (including UTF-8 encoded files)."
LICENSE = "GPL-2.0-or-later"

PV = "1.94a"

RPM_NAME = "sgrep-1.94a-1.12.aarch64.rpm"
RPM_HASH = "91931a0bfab0e0c7ce73aaebdfb379cf42f76685197ed910da1ea488d8d8f115e4e7f4c3b7648cecd40811141dc5ec0796e17ebeaac152c4cfac588db67941d6"

RPROVIDES:${PN} += "config(sgrep) \
sgrep \
sgrep(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
