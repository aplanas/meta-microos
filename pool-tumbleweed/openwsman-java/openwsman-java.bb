SUMMARY = "Java bindings for OpenWSMAN client API"
DESCRIPTION = "This package provides Java bindings to access the OpenWSMAN client API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-java-2.7.2-2.8.noarch.rpm"
RPM_HASH = "5d77c1ae6c099fcb91caec8158c762ad9f6158fd1d06da153f888643e36208ef20fb6d0bf3f308e936d7f8da133719b954e68959b645fb7c26d9525e8780e8c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openwsman-java"

RDEPENDS:${PN} += "java \
libwsman1"

inherit rpm
