SUMMARY = "Tools for tracing OpenGL"
DESCRIPTION = "This package contains libs that are preloaded into traced programs."
LICENSE = "MIT"

PV = "10.0"

RPM_NAME = "apitrace-wrappers-10.0-2.10.aarch64.rpm"
RPM_HASH = "02008cd6cc20815f76bb47d8c44cea0a8e2852d236d537beb31c909b9bc2e78713c1cbf36b1be26588a13bb7a2ec201c31418ca409711d5a70190cef88387237"

RPROVIDES:${PN} += "apitrace-wrappers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
