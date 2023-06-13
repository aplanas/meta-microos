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

RPM_NAME = "python310-lesscpy-0.15.1-1.4.noarch.rpm"
RPM_HASH = "0eba47fb18a3c53f5b2d61a2084b2a7d31c97ef9d99f7fd7a15236a4c22b2515ccdd4e1581739cf5b628def0a961794f84e2f2992fdc65d372754f9d560786ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lesscpy \
python3.10dist(lesscpy) \
python310-lesscpy \
python3dist(lesscpy)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-ply \
python310-setuptools \
python310-six \
update-alternatives"

inherit rpm
