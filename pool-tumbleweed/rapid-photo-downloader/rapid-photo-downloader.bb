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

RPM_NAME = "rapid-photo-downloader-0.9.34-2.2.noarch.rpm"
RPM_HASH = "34e7f8892d530a00add5c0d82c11b81dba973e5e61de5ccf9fc3bf9d5d06560107481550700012e9772e141a7c87455ed8886e22c1a42201ee39341f35855fb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-rapid-photo-downloader \
python3dist-rapid-photo-downloader \
rapid-photo-downloader"

RDEPENDS:${PN} += "/usr/bin/python3 \
exiftool \
ifuse \
imobiledevice-tools \
libQt5Svg5 \
python-abi \
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
typelib-GExiv2 \
typelib-GLib \
typelib-GUdev \
typelib-Gio \
typelib-Gst \
typelib-Notify \
typelib-UDisks"

inherit rpm
