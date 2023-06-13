SUMMARY = "Utilities for Amlogic SoCs"
DESCRIPTION = "Utilities for working with Amlogic 'Meson' SoCs"
LICENSE = "GPL-2.0+ & MIT"

PV = "0.1"

RPM_NAME = "meson-tools-0.1-1.23.aarch64.rpm"
RPM_HASH = "e60c77da22a7091b5201eb486643908cb5b42aa12fa99846a00ef89002b980baf6e94750a1d87d1ee66c162ee0df07909f2daed53daded55647804be4a081406"

RPROVIDES:${PN} += "meson-tools \
meson-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit)"

inherit rpm
