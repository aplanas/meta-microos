SUMMARY = "Alternative to sudo (root command execution) with regex support"
DESCRIPTION = "please is a regex-capable alternative to sudo, a command for allowing \
users to execute some subsequent commands as the root (or another) user. \
pleaseedit is a method to permit editing of files without \
elevation."
LICENSE = "(0BSD | MIT | Apache-2.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & Apache-2.0 & MIT & GPL-3.0-or-later"

PV = "0.5.1~git0.ce9627c"

RPM_NAME = "pleaser-0.5.1~git0.ce9627c-7.3.aarch64.rpm"
RPM_HASH = "a05e1a32215e83b369cd8f0c34cb65c512a5952d73ff7a4c1cb85e4a4e76dda6b1520415a2f3c1f1e40b4122aa899262d99293f930122ae35cf4393ee889db9f"

RPROVIDES:${PN} += "config-pleaser \
pleaser"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpam.so.0 \
pam \
permissions"

inherit rpm
