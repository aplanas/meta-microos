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

RPM_NAME = "python310-lesscpy-0.15.1-1.6.noarch.rpm"
RPM_HASH = "6ce362e0430da06b2e8c106e3fc3c94d249911b74ff968419024adf137ebd345613d85ff41764dc549e393cae9b0a4628fdf8557d2dfa73de1845ea9625fc5d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-lesscpy \
python310-lesscpy \
python3dist-lesscpy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-ply \
python310-setuptools \
python310-six \
update-alternatives"

inherit rpm
