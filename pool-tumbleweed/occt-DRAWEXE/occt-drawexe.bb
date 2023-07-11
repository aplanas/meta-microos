SUMMARY = "Development files for occt"
DESCRIPTION = "This package contains the OpenCASCADE DRAWEXE test \
harness executable."
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "occt-DRAWEXE-7.7.0-1.4.aarch64.rpm"
RPM_HASH = "d2a85bc6997b5e4a66beb4c7d1589761fafd5bf9ac2b920df03963ed7b86c253fd678355afbfb4382ed796a73dff1d325558d382c020b1818c743d40b2c9f666"

RPROVIDES:${PN} += "occt-DRAWEXE"

RDEPENDS:${PN} += "/usr/bin/bash \
libTKDraw.so.7.7 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
