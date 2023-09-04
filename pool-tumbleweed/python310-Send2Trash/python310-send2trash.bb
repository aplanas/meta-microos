SUMMARY = "Python library to send files to the Trash location"
DESCRIPTION = "Send2Trash is a small package that sends files to the Trash (or \
Recycle Bin) natively and on all platforms. On OS X, it uses native \
FSMoveObjectToTrashSync Cocoa calls, on Windows, it uses native (and \
ugly) SHFileOperation win32 calls. On other platforms, if PyGObject \
and GIO are available, it will use this. Otherwise, it will fallback \
to its own implementation of the trash specifications from \
freedesktop.org."
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "python310-Send2Trash-1.8.2-1.1.noarch.rpm"
RPM_HASH = "49e576aeaa8d360b88cf9aa025269618732f9f12c4a009ac21f5801511564e842171809ac2680e9a34537c76a83d4a29677089e5892471369efb6337506486bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-send2trash \
python310-Send2Trash \
python310-send2trash \
python3dist-send2trash"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
typelib-GObject \
typelib-Gio \
update-alternatives"

inherit rpm
