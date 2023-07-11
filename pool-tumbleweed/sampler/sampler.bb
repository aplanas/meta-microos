SUMMARY = "A tool for shell commands execution, visualization and alerting"
DESCRIPTION = "Sampler is a tool for shell commands execution, visualization and alerting. Configured with a simple YAML file."
LICENSE = "GPL-3.0-only"

PV = "1.1.0"

RPM_NAME = "sampler-1.1.0-2.13.aarch64.rpm"
RPM_HASH = "7bd06afe31b1923e243d46dc047089b012aef25169f40376f15eea66f2d0ba52a3c2606abd69b6bf0bc03a5d962df9d0a5775d981bbb6e65383a23422f982f93"

RPROVIDES:${PN} += "sampler"

RDEPENDS:${PN} += "libasound.so.2 \
libc.so.6"

inherit rpm
