SUMMARY = "Java Support for Native Language Support (NLS)"
DESCRIPTION = "This package includes the tools needed to support message catalogs in \
Java applications. It also includes example code for java, java+awt and \
java+swing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.21.1"

RPM_NAME = "gettext-java-0.21.1-2.1.aarch64.rpm"
RPM_HASH = "1d37b88c279b2f4a9fe6e5fdef586ba15b827cd0754f1e111af75acd3b8b05035bddd1bddc3461c66e957292c9d11bf5e115501a9009f3637e59ae5920cdf3c7"

RPROVIDES:${PN} += "gettext-java gettext-java(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
