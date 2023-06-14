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

RPM_NAME = "python39-lesscpy-0.15.1-1.4.noarch.rpm"
RPM_HASH = "2614b0ec375ec51079fc3c83e8b8069df62dbf99ac9510e6d3cb12ce45cc127b97c3aa13b3126dd42630b84359ef16d0100d1bb4129f1515982d9f032e6f713a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lesscpy \
python39-lesscpy \
python3dist-lesscpy"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-ply \
python39-setuptools \
python39-six \
update-alternatives"

inherit rpm
