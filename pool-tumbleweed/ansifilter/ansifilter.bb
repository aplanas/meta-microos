SUMMARY = "ANSI Terminal Escape Code Converter"
DESCRIPTION = "Ansifilter handles text files containing ANSI terminal escape codes. \
The command sequences may be stripped or be interpreted to generate formatted \
output (HTML, RTF, TeX, LaTeX, BBCode)."
LICENSE = "GPL-3.0-or-later"

PV = "2.19"

RPM_NAME = "ansifilter-2.19-1.3.aarch64.rpm"
RPM_HASH = "043b1d209c442ca375ff17e93072181426f4fc699b115bd9d4f46199d5828ac24fb6aef49f37ac44fb493f48491835e1fe4c51d092241376fd4d372d0dc22447"

RPROVIDES:${PN} += "ansifilter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
