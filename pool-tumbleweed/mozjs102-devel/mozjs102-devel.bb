SUMMARY = "Development files and tools for mozjs102"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
super set of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the header file and tools to develop with JavaScript."
LICENSE = "MPL-2.0"

PV = "102.14.0"

RPM_NAME = "mozjs102-devel-102.14.0-1.1.aarch64.rpm"
RPM_HASH = "3e1b895f80d0a1aa98a6312ed68d0eaba698ce88c14e940c07392ddb9a8e4c0a75854c7cf34245b52dec9db60b65230ed5c5a48d5a1169abee9eda36bfd308aa"

RPROVIDES:${PN} += "mozjs102-devel \
pkgconfig-mozjs-102"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmozjs-102-0 \
pkgconfig"

inherit rpm
