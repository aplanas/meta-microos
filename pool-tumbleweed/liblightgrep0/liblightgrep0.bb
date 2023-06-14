SUMMARY = "Multipattern regular expression searching for digital forensics"
DESCRIPTION = "liblightgrep is a regular expression engine designed \
for digital forensics. \
 \
* it searches for many patterns simultaneously, \
* searches binary data as a stream, not as discrete lines of text, \
* searches for patterns in many different encodings, \
* is a forward-looking only engine"
LICENSE = "LGPL-3.0-or-later"

PV = "1.4"

RPM_NAME = "liblightgrep0-1.4-5.34.aarch64.rpm"
RPM_HASH = "adf8316f29a2a058644b73b6d5eb318f7ccba91322da8763dee89611da60ca28c7f6f1df77c7eaa1965a8fe49955229fec2a733faa593b74158c560f2d796f0c"

RPROVIDES:${PN} += "liblightgrep.so.0 \
liblightgrep0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.73 \
libstdc++.so.6"

inherit rpm
