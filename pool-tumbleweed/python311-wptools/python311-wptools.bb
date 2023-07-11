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

RPM_NAME = "python311-wptools-0.4.17-4.18.noarch.rpm"
RPM_HASH = "77b764f5227c9d4a223b4a287c8b8eaeb4c897d172eab0cc59b051715c405659dc7c956960d96b1134a58545a3b9ca80bf6d449a030d35f1f3abf741dc818f4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wptools \
python3.11dist-wptools \
python311-wptools \
python3dist-wptools"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-certifi \
python311-html2text \
python311-lxml \
python311-pycurl \
update-alternatives"

inherit rpm
