SUMMARY = "Wyabdc RealPeople TTS audio collection of english words"
DESCRIPTION = "This package contains many wav files which can be used by StarDict to pronounce \
english words. Files originally come from wyabdc, http://www.zhimajie.net, \
thanks xiaozima."
LICENSE = "GPL-2.0+"

PV = "2.1.0"

RPM_NAME = "stardict-sounds-wyabdcrealpeopletts-2.1.0-15.17.noarch.rpm"
RPM_HASH = "b864fa7635da04baea395a9833cb3c662c4142408466f9b4fe0a599e568c2527b2ff0a484f55af4dfdce8a6bc27b45e28fc33b7a1331e953c9c8796fbb4aa9d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-stardict-en \
stardict-sounds-wyabdcrealpeopletts"

RDEPENDS:${PN} += ""

inherit rpm
