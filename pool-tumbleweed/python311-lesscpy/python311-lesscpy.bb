SUMMARY = "Lesscss compiler"
DESCRIPTION = "python LessCss Compiler. \
 \
A compiler written in python 3 for the lesscss language. \
For those of us not willing/able to have node.js installed in our environment. \
Not all features of lesscss are supported (yet). \
Some features wil probably never be supported (JavaScript evaluation). \
This program uses PLY (Python Lex-Yacc) to tokenize/parse the input."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "python311-lesscpy-0.15.1-1.6.noarch.rpm"
RPM_HASH = "222e85756fa8379322be6426b12e3b65838e158449d57c4e9517d13918ca6dcdc278c9074bb61f954597b0b7982802a803698bc1039d63c24d98a2cd2556a845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lesscpy \
python3.11dist-lesscpy \
python311-lesscpy \
python3dist-lesscpy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-ply \
python311-setuptools \
python311-six \
update-alternatives"

inherit rpm
