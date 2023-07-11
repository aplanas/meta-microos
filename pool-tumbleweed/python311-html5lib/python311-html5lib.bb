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

RPM_NAME = "python311-html5lib-1.1-4.3.noarch.rpm"
RPM_HASH = "0920a98268d55cc077818e77024978ee206ad4acfa507b3125ceb41ddb7bbc4ccaf449260c34de129fa64b6061b3d28ea4c505ae526dcb885458dcbecdb606f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-html5lib \
python3.11dist-html5lib \
python311-html5lib \
python3dist-html5lib"

RDEPENDS:${PN} += "python-abi \
python311-six \
python311-webencodings"

inherit rpm
