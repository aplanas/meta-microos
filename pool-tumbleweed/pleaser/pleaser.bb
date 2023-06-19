SUMMARY = "Alternative to sudo (root command execution) with regex support"
DESCRIPTION = "please is a regex-capable alternative to sudo, a command for allowing \
users to execute some subsequent commands as the root (or another) user. \
pleaseedit is a method to permit editing of files without \
elevation."
LICENSE = "(0BSD | MIT | Apache-2.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & Apache-2.0 & MIT & GPL-3.0-or-later"

PV = "0.5.1~git0.ce9627c"

RPM_NAME = "pleaser-0.5.1~git0.ce9627c-7.2.aarch64.rpm"
RPM_HASH = "24011a8bf472fc70c18a31e8a6e12249eb55ef653572ea377dc4d4c444c32495d08e07854d03589cdbeecf1ae4880a60f1ccfaa2bbd004b2c7f441eb135d1805"

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
