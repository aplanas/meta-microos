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

RPM_NAME = "python39-html5lib-1.1-5.1.noarch.rpm"
RPM_HASH = "967fa36334c8b84d28e25441c1ffadab88ce3ce7122466497b4f31a13ef314704097fe042c8c44d9280742336feb7141ff016ea003b3bf36d9630ca6a1d3300d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-html5lib \
python39-html5lib \
python3dist-html5lib"

RDEPENDS:${PN} += "python-abi \
python39-six \
python39-webencodings"

inherit rpm
