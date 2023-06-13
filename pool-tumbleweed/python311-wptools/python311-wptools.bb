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

RPM_NAME = "python311-wptools-0.4.17-4.17.noarch.rpm"
RPM_HASH = "3c003889db8105445334ef93e075aaf5883d53818a5dbab12635ba6c24a18276c9a3a8365784094893363b061c859bd68a8626ef127326cb235cc7ec61002e9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(wptools) \
python311-wptools \
python3dist(wptools)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-certifi \
python311-html2text \
python311-lxml \
python311-pycurl \
update-alternatives"

inherit rpm
