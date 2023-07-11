SUMMARY = "The client of the GNU Health Hospital system"
DESCRIPTION = "The client of the GNU Health Hospital application"
LICENSE = "GPL-3.0-only"

PV = "4.2.0"

RPM_NAME = "gnuhealth-client-4.2.0-1.2.noarch.rpm"
RPM_HASH = "d104444e5c96a7c5336d77eb3a931b69018f776b5f0d057253dbd6a7bf9c88f150b91b9846d05b9eed394210c4a86176f4126e3b8d0e4c3319b366a3728e2402"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuhealth-client \
python3.11dist-gnuhealth-client \
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
