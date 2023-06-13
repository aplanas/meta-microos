SUMMARY = "Programs to make file renaming easier"
DESCRIPTION = "The file renaming utilities (renameutils for short) are a set of programs \
designed to make renaming of files faster and less cumbersome. \
 \
This package consists of five programs - qmv, imv, icp, qcp and deurlname: \
 \
qmv ('quick move') allows file names to be edited in a text editor. The \
names of all files in a directory are written to a text file, which is \
then edited by the user. The text file is read and parsed, and the changes \
are applied to the files. \
 \
imv ('interactive move'), is trivial but useful when you are too lazy to \
type (or even complete) the name of the file to rename twice. It allows a \
file name to be edited in the terminal using the GNU Readline library. \
 \
icp and qcp are similar to imv and qmv but for copying using 'cp'. \
 \
deurlname removes URL encoded characters (such as %20 representing space) \
from file names. Some programs such as w3m tend to keep those characters \
encoded in saved files."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.0"

RPM_NAME = "renameutils-0.12.0-1.9.aarch64.rpm"
RPM_HASH = "d9d14792b6c3fa214e4acb40e3ecb356ada81edd39d9150031db1261501b4429f4817944813e01deca321f8f3232cf2d5d2e5fa212d9ee343fc6ae25cd260dbd"

RPROVIDES:${PN} += "renameutils \
renameutils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libreadline.so.8()(64bit)"

inherit rpm
