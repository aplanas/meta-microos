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

RPM_NAME = "python311-html5lib-1.1-5.1.noarch.rpm"
RPM_HASH = "2a1ccae557c89d427bf78e2b883b6ee84beb87d1497d4deafe2d32bc77e32086c07246722d3e5b95a46fc40d52746c8cf0239344c6f6754ea5ab757ec32a7461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-html5lib \
python3.11dist-html5lib \
python311-html5lib \
python3dist-html5lib"

RDEPENDS:${PN} += "python-abi \
python311-six \
python311-webencodings"

inherit rpm
