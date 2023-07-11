SUMMARY = "Generic Preprocessor"
DESCRIPTION = "GPP is a general-purpose preprocessor with customizable syntax, suitable \
for a wide range of preprocessing tasks. Its independence from any one \
programming language makes it much more versatile than the C preprocessor \
(cpp), while its syntax is lighter and more flexible than that of GNU m4. \
There are built-in macros for use with C/C++, LaTeX, HTML, XHTML, and \
Prolog files."
LICENSE = "LGPL-3.0+"

PV = "2.27"

RPM_NAME = "gpp-2.27-1.12.aarch64.rpm"
RPM_HASH = "7ae82fb049e34afdc627e9216aae558d3e79c767d3f0f011de4f98965885477c89e798d3842fb5c76a7d7ce03c555c80fa823ad9e4c95240584e1ee5b0041bf5"

RPROVIDES:${PN} += "gpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
