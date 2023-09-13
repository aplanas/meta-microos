SUMMARY = "Development files and tools for mozjs115"
DESCRIPTION = "JavaScript is the Netscape-developed object scripting language used in millions \
of web pages and server applications worldwide. Netscape's JavaScript is a \
super set of the ECMA-262 Edition 3 (ECMAScript) standard scripting language, \
with only mild differences from the published standard. \
 \
This package contains the header file and tools to develop with JavaScript."
LICENSE = "MPL-2.0"

PV = "115.2.0"

RPM_NAME = "mozjs115-devel-115.2.0-1.1.aarch64.rpm"
RPM_HASH = "bf72b5082cfba640429cfa920d45a8269cefc1678c76de523ad58245bbca32b83a17c5971d48316504b655fa90fbaf52509db5fb686903ebc6ae5151050bf256"

RPROVIDES:${PN} += "mozjs115-devel \
pkgconfig-mozjs-115"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmozjs-115-0 \
pkgconfig"

inherit rpm
