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

RPM_NAME = "ShellCheck-0.9.0-2.11.aarch64.rpm"
RPM_HASH = "fcd62a81613b9adb59044be8ce3986fb0e2e3326fd9f7efd0f88125667c5c79e04c921725288523fcb5ec294c057c2bfbad83f2a03fbc248149d15db5dfd5d85"

RPROVIDES:${PN} += "ShellCheck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
