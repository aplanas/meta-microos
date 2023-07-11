SUMMARY = "Support library for utilities from the Schily toolbox"
DESCRIPTION = "libschily contains many OS abstraction functions used by the Schily \
tools."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "libschily2_0-2022.10.16-47.4.aarch64.rpm"
RPM_HASH = "9a44cf7b41cd5b24b8daf599de2ce8e17906475a02675e0949bcae1bf2d0adda8eb0f788c91efad9b33636a705344756051ed43cc3f154c6bffe21bb72a4c9ed"

RPROVIDES:${PN} += "libschily.so.2.0 \
libschily2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
