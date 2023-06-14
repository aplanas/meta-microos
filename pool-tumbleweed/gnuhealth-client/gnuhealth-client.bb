SUMMARY = "The client of the GNU Health Hospital system"
DESCRIPTION = "The client of the GNU Health Hospital application"
LICENSE = "GPL-3.0-only"

PV = "4.2.0"

RPM_NAME = "gnuhealth-client-4.2.0-1.1.noarch.rpm"
RPM_HASH = "5bf6f3c1bb476943c57bab9896e773d8de2c746c0ae88df855e2f9a240d64132fd0ba17fb693cf497f6926d85734de2286dc6bd5aae10d8b5cd24283e4085566"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuhealth-client \
python3.10dist-gnuhealth-client \
python3dist-gnuhealth-client"

RDEPENDS:${PN} += "/usr/bin/python3 \
gnu-free-fonts \
gobject-introspection \
opencv \
python-abi \
python3-GooCalendar \
python3-cairo \
python3-chardet \
python3-dateutil \
python3-gnupg \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-numpy \
python3-opencv \
python3-pytz \
python3-setuptools \
python3-simplejson \
python3-xml"

inherit rpm
