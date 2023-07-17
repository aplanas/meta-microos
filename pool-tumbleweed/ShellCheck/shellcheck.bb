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

RPM_NAME = "ShellCheck-0.9.0-2.7.aarch64.rpm"
RPM_HASH = "2ebcd8c030f6ff26e5b14980c719d48ca6cd45e2b30f4381283963b171b6e9156188eca69b74b63060f290b0825a95e50b1fb78c2ea39b92f693efb14c1b570b"

RPROVIDES:${PN} += "ShellCheck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
