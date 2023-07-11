SUMMARY = "Javadoc for laf-plugin"
DESCRIPTION = "The goal of this project is to provide a small infrastructure that \
provides plugin mechanism for third-party components in look-and-feel \
libraries. \
 \
This package provides the Java (HTML) Documentation for laf-plugin."
LICENSE = "BSD-3-Clause & Zlib"

PV = "1.0"

RPM_NAME = "laf-plugin-javadoc-1.0-7.7.noarch.rpm"
RPM_HASH = "54002b04e5b6b23af81f733158e166f305b34012543725f133ce608276d99bc5e099cfd340d6bcfa9e8ad260941f0c9baddba969c1d03f6746d2acb7a4bc3cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "laf-plugin-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
