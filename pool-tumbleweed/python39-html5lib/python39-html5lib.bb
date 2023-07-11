SUMMARY = "HTML parser based on the WHAT-WG Web Applications 1"
DESCRIPTION = "HTML parser designed to follow the HTML5 \
specification. The parser is designed to handle all flavours of HTML and \
parses invalid documents using well-defined error handling rules compatible \
with the behaviour of major desktop web browsers. \
 \
Output is to a tree structure; the current release supports output to \
DOM, ElementTree, lxml and BeautifulSoup tree formats as well as a \
simple custom format"
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python39-html5lib-1.1-4.3.noarch.rpm"
RPM_HASH = "28fec95492493a2a9740aaf48dedb033ca7c6f310dc8fdd12dedb22b6bfc38d005d67c7bc440ad25d2bcb75cbe4943f332d70495b6511c93f8ac2cd4f4d38f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-html5lib \
python39-html5lib \
python3dist-html5lib"

RDEPENDS:${PN} += "python-abi \
python39-six \
python39-webencodings"

inherit rpm
