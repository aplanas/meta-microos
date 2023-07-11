SUMMARY = "String of Unicode characters (UTF-16BE)"
DESCRIPTION = "A 'Unicode::String' object represents a sequence of Unicode characters. \
Methods are provided to convert between various external formats \
(encodings) and 'Unicode::String' objects, and methods are provided for \
common string manipulations. \
 \
The functions utf32be(), utf32le(), utf16be(), utf16le(), utf8(), utf7(), \
latin1(), uhex(), uchr() can be imported from the 'Unicode::String' module \
and will work as constructors initializing strings of the corresponding \
encoding. \
 \
The 'Unicode::String' objects overload various operators, which means that \
they in most cases can be treated like plain strings. \
 \
Internally a 'Unicode::String' object is represented by a string of 2 byte \
numbers in network byte order (big-endian). This representation is not \
visible by the API provided, but it might be useful to know in order to \
predict the efficiency of the provided methods."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "2.10"

RPM_NAME = "perl-Unicode-String-2.10-1.33.aarch64.rpm"
RPM_HASH = "d3cfe60b58222069f377b6b21a9c4c019b984d59e93f5837ba52d7176c513768627638c5e0f2d0ac7720986374da25f5ffb058397e42bfb150b51c27d67b7af8"

RPROVIDES:${PN} += "perl-Unicode--CharName \
perl-Unicode--String \
perl-Unicode-String"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
