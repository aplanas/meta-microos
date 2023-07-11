SUMMARY = "Shell script analysis tool"
DESCRIPTION = "The goals of ShellCheck are: \
 \
* To point out and clarify typical beginner's syntax issues, that causes a \
shell to give cryptic error messages. \
 \
* To point out and clarify typical intermediate level semantic problems, that \
causes a shell to behave strangely and counter-intuitively. \
 \
* To point out subtle caveats, corner cases and pitfalls, that may cause an \
advanced user's otherwise working script to fail under future circumstances."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "ShellCheck-0.9.0-2.6.aarch64.rpm"
RPM_HASH = "0707cafab87b9ac25f5f2b1a68dd6855c16ac1785b29e87a7e567c17ba962cffd0b5db4f8893e35d5de6679a6fd9eb59218e112aea90b0308988e29942b9820b"

RPROVIDES:${PN} += "ShellCheck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
