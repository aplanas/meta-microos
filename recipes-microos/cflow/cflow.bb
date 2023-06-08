SUMMARY = "Tool to generate flowcharts for C sources"
DESCRIPTION = "GNU cflow analyzes a collection of C source files and prints a graph, charting \
control flow within the program. GNU cflow is able to produce both direct and \
inverted flowgraphs for C sources. Optionally a cross-reference listing can be \
generated. Two output formats are implemented: POSIX and GNU (extended). Input \
files can optionally be preprocessed before analyzing."
LICENSE = "GPL-3.0-or-later"

PV = "1.7"

RPM_NAME = "cflow-1.7-1.7.aarch64.rpm"
RPM_HASH = "7c537136688e7babd8ea7ea9e3205962f97105a037742b5ff438222c3a425b0050ef2ce0cf5aacce4c83f7239c782d774c941a38c71d70024562865ff890b7b4"

RPROVIDES:${PN} += "cflow cflow(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
