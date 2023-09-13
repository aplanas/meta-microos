SUMMARY = "Development files and tools for mozjs102"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
super set of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the header file and tools to develop with JavaScript."
LICENSE = "MPL-2.0"

PV = "102.15.0"

RPM_NAME = "mozjs102-devel-102.15.0-1.1.aarch64.rpm"
RPM_HASH = "414436ec6e85589af25f5507746491dc84daaa61a71893cec84b868b4c8e1bfcf3d02d8de7585725783f6088bdcdd3107aba60aef28b08d9593451b12c0490bb"

RPROVIDES:${PN} += "mozjs102-devel \
pkgconfig-mozjs-102"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmozjs-102-0 \
pkgconfig"

inherit rpm
