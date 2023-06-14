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

RPM_NAME = "ShellCheck-0.9.0-2.3.aarch64.rpm"
RPM_HASH = "8eb3f3d002c9e2fa75bf9fa6434e747c44833797aae47eb9df3ce02b82ced83df591ff5b50282a6b872fbf66f04f90c2f350d2a09372e67412f89a604039a65d"

RPROVIDES:${PN} += "ShellCheck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
