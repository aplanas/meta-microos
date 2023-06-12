SUMMARY = "A library for reading and writing One Must Fall 2097 datafiles"
DESCRIPTION = "libShadowDive is a library for reading and writing One Must Fall 2097 datafiles. \
The library can deal with the following files: \
 \
  * HAR Data files (*.AF) \
  * Arena/background data files (*.BK) \
  * Language files (ENGLISH.DAT,GERMAN.DAT) \
  * Sound data file (SOUNDS.DAT) \
  * Characters for both big and small fonts (GRAPHCHR.DAT, CHARSMAL.DAT) \
  * Score file (SCORES.DAT) \
  * Pilot image files (*.PIC) \
  * Tournament data files (*.TRN) \
  * Character save files (*.CHR) \
  * Match record files (*.REC) \
  * Alternate palette file (ALTPALS.DAT)"
LICENSE = "MIT"

PV = "0.6.5+git.20190205"

RPM_NAME = "libshadowdive0_0_0-suse-0.6.5+git.20190205-3.12.aarch64.rpm"
RPM_HASH = "9ad36353ba48829a8b592c3d76596dc0ff305d03ff66f9f0c5d370e6c25b97d1d1a3d9d1516f60fbb3ec754af64702f0d18ec12886e127665346747f100508dd"

RPROVIDES:${PN} += "libshadowdive.so.0.0.0-suse()(64bit) \
libshadowdive0_0_0-suse \
libshadowdive0_0_0-suse(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
