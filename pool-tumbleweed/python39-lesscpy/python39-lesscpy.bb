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

RPM_NAME = "python39-lesscpy-0.15.1-1.6.noarch.rpm"
RPM_HASH = "091d8f6992d29a51fe8031384f8779b3fea4ea178248e49f04edba21789c3bee84dcb64302b0d3da6a5a0b69cc5c175464d19d4d4da85324d420564b735cd27f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lesscpy \
python39-lesscpy \
python3dist-lesscpy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-ply \
python39-setuptools \
python39-six \
update-alternatives"

inherit rpm
