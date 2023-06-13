SUMMARY = "Parallel downloader for camera and smartphone photos"
DESCRIPTION = "Rapid Photo Downloader downloads images in parallel from multiple devices, \
from every camera supported by gphoto2, including smartphones. \
 \
RPD has a timeline, which groups photos and videos based on how much \
time elapsed between consecutive shots. It can be used to identify \
photos and videos taken at different periods in a single day or over \
consecutive days."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.34"

RPM_NAME = "rapid-photo-downloader-0.9.34-2.1.noarch.rpm"
RPM_HASH = "541d8f9217a2ccfdf7d866e23a62dd1f571b35fb969f998b0cb5ab30c51a844ec4cc9791bdf96f17fecd9af03787c0b7ffe6d86b3f7fb31d1619aa9ac15cf970"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(net.damonlynch.rapid_photo_downloader.desktop) \
metainfo() \
metainfo(net.damonlynch.rapid_photo_downloader.metainfo.xml) \
mimehandler(x-content/image-dcf) \
python3.10dist(rapid-photo-downloader) \
python3dist(rapid-photo-downloader) \
rapid-photo-downloader"

RDEPENDS:${PN} += "/usr/bin/python3 \
exiftool \
ifuse \
imobiledevice-tools \
libQt5Svg5 \
python(abi) \
python3 \
python3-Babel \
python3-PyPrind \
python3-arrow \
python3-cairo \
python3-colorlog \
python3-colour \
python3-easygui \
python3-gobject \
python3-gobject-Gdk \
python3-gphoto2 \
python3-psutil \
python3-pymediainfo \
python3-python-dateutil \
python3-pyxdg \
python3-pyzmq \
python3-qt5 \
python3-requests \
python3-show-in-file-manager \
python3-sortedcontainers \
python3-tenacity \
python3-tornado \
typelib(GExiv2) \
typelib(GLib) \
typelib(GUdev) \
typelib(Gio) \
typelib(Gst) \
typelib(Notify) \
typelib(UDisks)"

inherit rpm
