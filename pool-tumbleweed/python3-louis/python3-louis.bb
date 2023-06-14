SUMMARY = "Python3 bindings for the liblouis braille translator"
DESCRIPTION = "liblouis is a translator from and to braille. It features support for \
computer and literary braille, supports contracted and uncontracted \
translation for many languages and has support for hyphenation. \
 \
This subpackage contains the Python3 bindings."
LICENSE = "LGPL-3.0-or-later"

PV = "3.25.0"

RPM_NAME = "python3-louis-3.25.0-1.1.aarch64.rpm"
RPM_HASH = "66b3936434d7107076f928614d8e0433c6271cb7898e9281df73fc19719f10b024423e473600142439b15f22dee3295bf156a326f5c6ff66f8c4a8cd39026f04"

RPROVIDES:${PN} += "python3-louis \
python3.10dist-louis \
python3dist-louis"

RDEPENDS:${PN} += "liblouis20 \
python-abi"

inherit rpm
