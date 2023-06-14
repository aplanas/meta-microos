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

RPM_NAME = "python311-lesscpy-0.15.1-1.4.noarch.rpm"
RPM_HASH = "9657a38278f605beb7ac6635dfa9a32df62c6a1d6094dbbbc01d9b9062704af2e7ebf360062267b9e81dc6113196470c1dbed546fd7d9de6de95df623d54dab8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-lesscpy \
python311-lesscpy \
python3dist-lesscpy"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-ply \
python311-setuptools \
python311-six \
update-alternatives"

inherit rpm
