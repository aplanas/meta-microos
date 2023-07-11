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

RPM_NAME = "python310-html5lib-1.1-4.3.noarch.rpm"
RPM_HASH = "c988cf2844a4f9eb39a5bb8c569a4d57adb0af17cd3d6d65de63b3f4eaeaf18effd4c5c1564cd74392822e57e23396eeb0065fe204d3e2bea0301625f50d46d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-html5lib \
python310-html5lib \
python3dist-html5lib"

RDEPENDS:${PN} += "python-abi \
python310-six \
python310-webencodings"

inherit rpm
