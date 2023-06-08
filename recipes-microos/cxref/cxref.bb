SUMMARY = "C Cross Referencing & Documenting tool"
DESCRIPTION = "Cxref is a program that will produce documentation (in LaTeX, HTML, RTF or SGML) \
including cross-references from C program source code. \
 \
Works for ANSI C, including most gcc extensions. \
 \
The documentation for the program is produced from comments in the code that \
are appropriately formatted. The cross referencing comes from the code itself \
and requires no extra work. \
 \
The documentation is produced for each of the following: \
 \
Files            - A comment that applies to the whole file. \
Functions        - A comment for the function, including a description of \
                   each of the arguments and the return value. \
Variables        - A comment for each of a group of variables and/or \
                   individual variables. \
 \
 \
                   for macro arguments. \
Type definitions - A comment for each defined type and for each element of a \
                   structure or union type. \
 \
Any or all of these comments can be present in suitable places in the \
source code. \
 \
The cross referencing is performed for the following items \
 \
Files           - The files that the current file is included in \
                  (even when included via other files). \
 \
 \
                - Files included by these files etc. \
 \
Variables       - The location of the definition of external variables. \
                - The files that have visibility of global variables. \
                - The files / functions that use the variable. \
 \
Functions       - The file that the function is prototyped in. \
                - The functions that the function calls. \
                - The functions that call the function. \
                - The files and functions that reference the function. \
                - The variables that are used in the function. \
 \
Each of these items is cross referenced in the output. \
 \
Includes extensive README and FAQ with details and examples on how to use the \
program."
LICENSE = "GPL-2.0"

PV = "1.6e"

RPM_NAME = "cxref-1.6e-2.25.aarch64.rpm"
RPM_HASH = "380fdac00aa91068ae0038cf67c512569fab3e19f6fac3aacffb9a02184d500d555b5ab55ff9e42c97a3eb10365937d0f3ee2b40c6bcf989eb2092c7b4572d14"

RPROVIDES:${PN} += "cxref cxref(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
