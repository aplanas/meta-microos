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

RPM_NAME = "python310-wptools-0.4.17-4.17.noarch.rpm"
RPM_HASH = "7e2e6d5c73d9a8ec286cd8ccbea7e87867a4293eba54ab597c25051c5cdbb72193333cbb834f1ed1975cccd6b9f9540f00d62722b39c87b74c2e9b8f87f2b1ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wptools \
python3.10dist-wptools \
python310-wptools \
python3dist-wptools"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-certifi \
python310-html2text \
python310-lxml \
python310-pycurl \
update-alternatives"

inherit rpm
