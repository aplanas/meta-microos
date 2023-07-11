SUMMARY = "Python3 bindings for the liblouis braille translator"
DESCRIPTION = "liblouis is a translator from and to braille. It features support for \
computer and literary braille, supports contracted and uncontracted \
translation for many languages and has support for hyphenation. \
 \
This subpackage contains the Python3 bindings."
LICENSE = "LGPL-3.0-or-later"

PV = "3.25.0"

RPM_NAME = "python3-louis-3.25.0-1.2.aarch64.rpm"
RPM_HASH = "7630e8100b0d7614065abf0f86a96982ffa248690708e0e157f5e044f4991ca8d8808a8819fef0a958165340d41e491748d7f415b64d8383408ef8b0bd870d93"

RPROVIDES:${PN} += "python3-louis \
python3.11dist-louis \
python3dist-louis"

RDEPENDS:${PN} += "liblouis20 \
python-abi"

inherit rpm
