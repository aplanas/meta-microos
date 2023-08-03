SUMMARY = "Nginx virtual host traffic status module"
DESCRIPTION = "This is an Nginx module that provides access to virtual host status \
information. It contains the current status such as servers, upstreams, caches. \
This is similar to the live activity monitoring of nginx plus. The built-in html \
is also taken from the demo page of old version."
LICENSE = "BSD-2-Clause"

PV = "0.2.2"

RPM_NAME = "nginx-module-vts-0.2.2-1.1.aarch64.rpm"
RPM_HASH = "376118ac412fbc17f0ed1b0c8300b032950f60b41b3a67adfc32d608bdc3af26f544eb07f5cc6b2e9794ff78c853363eb045df16368585da18abd414991853e5"

RPROVIDES:${PN} += "nginx-module-vts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
nginx"

inherit rpm
