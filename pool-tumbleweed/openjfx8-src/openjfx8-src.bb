SUMMARY = "OpenJFX Source Bundle"
DESCRIPTION = "OpenJFX Source Bundle."
LICENSE = "BSD-3-Clause & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "8.0.202"

RPM_NAME = "openjfx8-src-8.0.202-8.4.aarch64.rpm"
RPM_HASH = "a143d3b46f1d2bca2d9ce213999b275449eca14419a507cba42865783fef06165e6d1c20d293687b3da0bf2a2fc29f65176a8d638978ea46018e72df10310003"

RPROVIDES:${PN} += "java-1-8-0-openjfx-src \
openjfx8-src"

RDEPENDS:${PN} += "openjfx8"

inherit rpm
