SUMMARY = "Generate command-line completions using a simple DSL"
DESCRIPTION = " \
Generate tab completion for any shell command by specifying its usage in a familiar manpage-like format."
LICENSE = "MIT"

PV = "1.0+git.20220402.ec8fccc"

RPM_NAME = "compleat-1.0+git.20220402.ec8fccc-1.10.aarch64.rpm"
RPM_HASH = "e02c6c33470399502aae52e46cef959a5b7e06404e02317abb6ed593b0e4558dde0b02c08ffab7509742d409792fded276997e729dd1bc84624cef172d997680"

RPROVIDES:${PN} += "compleat"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
