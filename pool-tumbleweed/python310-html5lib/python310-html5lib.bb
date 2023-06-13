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

RPM_NAME = "python310-html5lib-1.1-4.1.noarch.rpm"
RPM_HASH = "12b0773518b83894f80ce595e8bcd704d6daa67638dfc98d0638ce0badbb4a6973cd7274da205d1584d736338453349d13e12554039edd324dde444c45f6a186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-html5lib \
python3.10dist(html5lib) \
python310-html5lib \
python3dist(html5lib)"

RDEPENDS:${PN} += "python(abi) \
python310-six \
python310-webencodings"

inherit rpm
