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

RPM_NAME = "python310-html5lib-1.1-5.1.noarch.rpm"
RPM_HASH = "ffe2f7d800d8a9fe8e19fbfe24125978269c9e7004fa6fb330970be3fea9722ab102dbdfc17b0425f67ec4fb0eaa81dbf35b34ef00e88f4f22e49be8072cc03a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-html5lib \
python310-html5lib \
python3dist-html5lib"

RDEPENDS:${PN} += "python-abi \
python310-six \
python310-webencodings"

inherit rpm
