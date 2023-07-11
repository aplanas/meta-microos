SUMMARY = "API documentation for openjpeg2"
DESCRIPTION = "The OpenJPEG library is an open-source JPEG 2000 codec written in C language. \
 \
This package provides the API documentation for openjpeg2."
LICENSE = "BSD-2-Clause"

PV = "2.5.0"

RPM_NAME = "openjpeg2-devel-doc-2.5.0-3.4.aarch64.rpm"
RPM_HASH = "7f812672a1bf49e721f89d981ec8bc32ba1478bb2e9e601a198fdc0b1f8646ecdb418e636d2ae779b55c8322739886bba51f535589abdf20e3354b882c4a308c"

RPROVIDES:${PN} += "openjpeg2-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
