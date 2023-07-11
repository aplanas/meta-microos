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

RPM_NAME = "python310-Send2Trash-1.8.0-1.11.noarch.rpm"
RPM_HASH = "caa374160a89e48dce92969d000b5aad2dce4574d1fe42990ac529915082f2effb5a2a15ffe7878d5f0f92a4ae72ec58a6976966e6941754c225d7b14df6a0e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-send2trash \
python310-Send2Trash \
python3dist-send2trash"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
typelib-GObject \
typelib-Gio \
update-alternatives"

inherit rpm
