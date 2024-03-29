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

RPM_NAME = "cxref-1.6e-2.26.aarch64.rpm"
RPM_HASH = "b6f8a87b94f671081fcfb4beb723f56f043c9d674e316b8dccde991e60a7936ac8e2ca30371910d1707a274fb5db648282331a502c15042e0b545e9bbc2fc446"

RPROVIDES:${PN} += "cxref"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
