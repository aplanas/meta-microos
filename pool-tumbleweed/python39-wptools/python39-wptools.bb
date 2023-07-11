SUMMARY = "Wikipedia tools (for Humans)"
DESCRIPTION = "Python and command-line MediaWiki access for Humans. \
 \
Features: \
* get an HTML or plain text 'extract' (lead or summary) \
* get a representative image (pageimage, thumb, etc.) \
* get an Infobox as a python dictionary \
* get any/all Wikidata by title \
* get info in any language \
* get random info"
LICENSE = "MIT"

PV = "0.4.17"

RPM_NAME = "python39-wptools-0.4.17-4.18.noarch.rpm"
RPM_HASH = "5bb7d9680fcf98c5c8f1ffc51c21b0c75290c5ca31cc94d0bc1fff3c8b2907fffd94c0a71f787c6a29aac8149442b30db3feb92a4786eb85530a1bca259db168"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wptools \
python39-wptools \
python3dist-wptools"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-certifi \
python39-html2text \
python39-lxml \
python39-pycurl \
update-alternatives"

inherit rpm
