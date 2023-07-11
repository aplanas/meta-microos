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

RPM_NAME = "python311-Send2Trash-1.8.0-1.11.noarch.rpm"
RPM_HASH = "e009697c35df4ab28735cdc43f9917eb3d93b64e5fe256474d219c10fea36a59473d08a0dafaeef1bb70b8db030a6744c79e057107d95875713ff7b07565ff13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Send2Trash \
python3.11dist-send2trash \
python311-Send2Trash \
python3dist-send2trash"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
typelib-GObject \
typelib-Gio \
update-alternatives"

inherit rpm
