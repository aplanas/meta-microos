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

RPM_NAME = "libshadowdive0_0_0-suse-0.6.5+git.20190205-3.13.aarch64.rpm"
RPM_HASH = "9e08ecfec3530aa07f7cc44f3135f12ceef8a678f7b596c33fd8b07a8ba5be82c55e7d713d47cc1cfe37e014935028ae25417d6495172b31f012a901c8ef3499"

RPROVIDES:${PN} += "libshadowdive.so.0.0.0-suse \
libshadowdive0-0-0-suse"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libpng16.so.16"

inherit rpm
