SUMMARY = "JavaScript's library"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
superset of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the JavaScript's library."
LICENSE = "MPL-2.0"

PV = "102.11.0"

RPM_NAME = "libmozjs-102-0-102.11.0-1.2.aarch64.rpm"
RPM_HASH = "f06c700691b599e6d0d951ab51c82afa292f9c101f211547695704ab7833facd99fdac75e36448cbefadae5b10b00dda2dcf6594908ded81d1ebad268d4db5ea"

RPROVIDES:${PN} += "libmozjs-102-0 \
libmozjs-102-0(aarch-64) \
libmozjs-102.so.0()(64bit) \
libmozjs-102.so.0(mozjs_102)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
