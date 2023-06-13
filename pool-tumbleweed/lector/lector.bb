SUMMARY = "Qt based ebook reader"
DESCRIPTION = " \
Currently supports: \
 \
* pdf \
* epub \
* mobi \
* azw / azw3 / azw4 \
* cbr / cbz"
LICENSE = "GPL-3.0-or-later"

PV = "0.5.1"

RPM_NAME = "lector-0.5.1-2.16.noarch.rpm"
RPM_HASH = "760e086df70942fec626c803012000d58ecfeeea265950cf9baeb4474d836b117656832de6f0964c0ac8d8d304005001514968f29d4f45935442f246bed1102b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(lector.desktop) \
lector \
mimehandler(application/epub+zip) \
mimehandler(application/ereader) \
mimehandler(application/pdf) \
mimehandler(application/x-cbr) \
mimehandler(application/x-cbz) \
mimehandler(application/x-mobi8-ebook) \
mimehandler(application/x-mobipocket-ebook) \
mimehandler(application/x-mobipocket-subscription) \
python3.10dist(lector) \
python3dist(lector)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3 \
python3-beautifulsoup4 \
python3-lxml \
python3-qt5 \
python3-xmltodict"

inherit rpm
