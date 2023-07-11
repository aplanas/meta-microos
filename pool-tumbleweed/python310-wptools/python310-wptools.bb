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

RPM_NAME = "python310-wptools-0.4.17-4.18.noarch.rpm"
RPM_HASH = "4eb72f93bd5f8aeb34fb6bf5d53150f76b8a8816ed05e04ad605e5f45fc49b05fba09b410e14d3a105e0f1d4b6fea4257bb3be777cdce24ef54995d5b618c230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wptools \
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
