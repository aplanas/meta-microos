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

RPM_NAME = "python39-Send2Trash-1.8.2-1.1.noarch.rpm"
RPM_HASH = "df54ad80bbf7d61ee6fefd4eec25a0244676a9cbb042bcc96bda865dec3c501090c3819a8397c47ea0f401ef571d7409b5458b0c52c84b3c590db6f1047079ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-send2trash \
python39-Send2Trash \
python39-send2trash \
python3dist-send2trash"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
typelib-GObject \
typelib-Gio \
update-alternatives"

inherit rpm
