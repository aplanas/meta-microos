SUMMARY = "maps charsets from and to utf16 unicode"
DESCRIPTION = "This module converts strings from and to 2-byte Unicode UCS2 format. All \
mappings happen via 2 byte UTF16 encodings, not via 1 byte UTF8 encoding. \
To transform these use Unicode::String. \
 \
For historical reasons this module coexists with Unicode::Map8. Please use \
Unicode::Map8 unless you need to care for two byte character sets, e.g. \
chinese GB2312. Anyway, if you stick to the basic functionality (see \
documentation) you can use both modules equivalently. \
 \
Practically this module will disappear from earth sooner or later as \
Unicode mapping support needs somehow to get into perl's core. If you like \
to work on this field please don't hesitate contacting Gisle Aas! \
 \
This module can't deal directly with utf8. Use Unicode::String to convert \
utf8 to utf16 and vice versa. \
 \
Character mapping is according to the data of binary mapfiles in \
Unicode::Map hierarchy. Binary mapfiles can also be created with this \
module, enabling you to install own specific character sets. Refer to \
mkmapfile or file REGISTRY in the Unicode::Map hierarchy."
LICENSE = "GPL-2.0+ | Artistic-1.0"

PV = "0.112"

RPM_NAME = "perl-Unicode-Map-0.112-13.37.aarch64.rpm"
RPM_HASH = "adb4837689e3d2e2092791a1b4220bf2b515750b6a42a5642b1d7161a0fae9fac0478d2b8138327c0c229eb3a80288668517d394bf2bc4515ebd14b4dab36dec"

RPROVIDES:${PN} += "perl-Unicode--Map \
perl-Unicode-Map"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
