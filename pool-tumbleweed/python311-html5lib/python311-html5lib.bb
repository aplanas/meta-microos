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

RPM_NAME = "python311-html5lib-1.1-4.1.noarch.rpm"
RPM_HASH = "fcc64173c31b02cbf1fa0182b8edc649a56f3a53b6ce2f01dc0f67e75d2cd5155c3fe3e21b462685ef1820d99790a34df8daed36c1a1eed0c02e102cbe00ced9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(html5lib) \
python311-html5lib \
python3dist(html5lib)"
RDEPENDS:${PN} += "python(abi) \
python311-six \
python311-webencodings"

inherit rpm
