SUMMARY = "Commandline utilities for EditorConfig"
DESCRIPTION = "EditorConfig makes it easy to maintain the correct coding style when switching \
between different text editors and between different projects. The EditorConfig \
project maintains a file format and plugins for various text editors which allow \
this file format to be read and used by those editors. For information on the \
file format and supported text editors, see the EditorConfig website. \
 \
This package contains command line utilities."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "0.12.6"

RPM_NAME = "editorconfig-0.12.6-1.1.aarch64.rpm"
RPM_HASH = "bb20512eec50f6d0df158ba849dccae4b529582c234c2687c68cb2ebacd7bcfcdb9aae7baa08780d68a633a2b20488052d78fd4014152e1c60fce24dc8d48af5"

RPROVIDES:${PN} += "editorconfig editorconfig(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libeditorconfig.so.0()(64bit)"

inherit rpm
