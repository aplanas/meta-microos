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

RPM_NAME = "python311-Send2Trash-1.8.2-1.1.noarch.rpm"
RPM_HASH = "893189f1bf7d38cf450270e5f4550a611f0a6d454fcdcd5dfc41909e1862ddb93e16c40dfccd7b22b6b84d0f64277b73ad28d593395f0572983b2fea9fe18a59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Send2Trash \
python3-send2trash \
python3.11dist-send2trash \
python311-Send2Trash \
python311-send2trash \
python3dist-send2trash"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
typelib-GObject \
typelib-Gio \
update-alternatives"

inherit rpm
