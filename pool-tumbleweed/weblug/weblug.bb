SUMMARY = "Simple webhook receiver program"
DESCRIPTION = "Simple webhook receiver program"
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "weblug-0.4-2.1.aarch64.rpm"
RPM_HASH = "65c94dff91d4ceec5f1d622c8382115ee503a5fe367f960fafb79f8f1e15c5974fc5a8c70cf226dd37d492797f9e6382a138828882d2abb5460fdd83253f2b45"

RPROVIDES:${PN} += "config-weblug \
weblug"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
