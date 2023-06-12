SUMMARY = "Translations for package deepin-voice-note"
DESCRIPTION = "Provides translations for the 'deepin-voice-note' package."
LICENSE = "GPL-3.0+"

PV = "5.10.18"

RPM_NAME = "deepin-voice-note-lang-5.10.18-1.3.noarch.rpm"
RPM_HASH = "99fe06b03fbb099316025c223373b72859323eb7dff28135331d8878a5d1a94f267f064f5d7ee084f29f137879d75c5a9ecef65270de2e0f0a8111b18eb8007b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-voice-note-lang \
deepin-voice-note-lang-all"
RDEPENDS:${PN} += "deepin-voice-note"

inherit rpm
