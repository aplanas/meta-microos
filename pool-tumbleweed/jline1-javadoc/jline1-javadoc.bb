SUMMARY = "API documentation for jline1"
DESCRIPTION = "This package contains the API documentation for jline1."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "jline1-javadoc-1.0-2.6.noarch.rpm"
RPM_HASH = "d71c4b2ace0ce9f7557b97844b2c27a80a41cb3eaeb1b9bab282311800e650a9d8d45de36669970ec070886801bc2b04d17b2ba2d87ebb83777edf09f045ead2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline1-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
