SUMMARY = "Searching for Structured Patterns"
DESCRIPTION = "Sgrep is like 'grep' but it will also work for structured patterns. You can \
use the program to extract fragments from SGML/XML or any other well formed \
text files (including UTF-8 encoded files)."
LICENSE = "GPL-2.0-or-later"

PV = "1.94a"

RPM_NAME = "sgrep-1.94a-1.13.aarch64.rpm"
RPM_HASH = "06134b9bfac22fddb99e009e90fffc6c77361cc25342a098f24220448581cd8969bba11d706a191af7bded0918b4a7e0cd8e1a0cb0c1d28d81f28de8fc614674"

RPROVIDES:${PN} += "config-sgrep \
sgrep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
