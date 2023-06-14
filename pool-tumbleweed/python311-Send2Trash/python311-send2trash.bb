SUMMARY = "Python library to send files to the Trash location"
DESCRIPTION = "Send2Trash is a small package that sends files to the Trash (or \
Recycle Bin) natively and on all platforms. On OS X, it uses native \
FSMoveObjectToTrashSync Cocoa calls, on Windows, it uses native (and \
ugly) SHFileOperation win32 calls. On other platforms, if PyGObject \
and GIO are available, it will use this. Otherwise, it will fallback \
to its own implementation of the trash specifications from \
freedesktop.org."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python311-Send2Trash-1.8.0-1.9.noarch.rpm"
RPM_HASH = "e230b56c650cefe04996ff4ac1c5630cd7d7cdf4ade88aa592b943cb8b56cd8649954117760cbd303f2ce6a3e1e14c8a9910263b30bae27f40e4de2ed2541349"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-send2trash \
python311-Send2Trash \
python3dist-send2trash"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
typelib-GObject \
typelib-Gio \
update-alternatives"

inherit rpm
