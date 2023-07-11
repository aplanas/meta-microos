SUMMARY = "Tool to generate flowcharts for C sources"
DESCRIPTION = "GNU cflow analyzes a collection of C source files and prints a graph, charting \
control flow within the program. GNU cflow is able to produce both direct and \
inverted flowgraphs for C sources. Optionally a cross-reference listing can be \
generated. Two output formats are implemented: POSIX and GNU (extended). Input \
files can optionally be preprocessed before analyzing."
LICENSE = "GPL-3.0-or-later"

PV = "1.7"

RPM_NAME = "cflow-1.7-1.8.aarch64.rpm"
RPM_HASH = "65573e6e235f545fa57a0f0bdd39ccdd934f5c09c31c8230d687865678f1d3f1d5472c67b4c8f1a51ccce5e181cf16481100a53b5a6a8816e47ade3a17eae597"

RPROVIDES:${PN} += "cflow"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
