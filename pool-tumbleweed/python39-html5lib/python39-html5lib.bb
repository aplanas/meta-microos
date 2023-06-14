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

RPM_NAME = "python39-html5lib-1.1-4.1.noarch.rpm"
RPM_HASH = "fdb3919a596f0e14881a770debc00f0b7199ef38120375b5daf8f1a94b1ec8e391d141e531687809a18204004c321c2f07b240f10fb7113d95c9d26157871588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-html5lib \
python39-html5lib \
python3dist-html5lib"

RDEPENDS:${PN} += "python-abi \
python39-six \
python39-webencodings"

inherit rpm
