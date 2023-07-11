SUMMARY = "Python package to play and record audio"
DESCRIPTION = "SoundCard is a library for playing and recording audio without \
resorting to a CPython extension. Instead, it is implemented using \
CFFI and the native audio libraries of Linux, Windows and macOS. \
 \
SoundCard is cross-platform, and supports Linux/pulseaudio, \
Mac/coreaudio, and Windows/WASAPI. While the interface is identical \
across platforms, naming schemes and block sizes can vary between \
devices and platforms."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "python310-SoundCard-0.4.2-1.5.noarch.rpm"
RPM_HASH = "10e88503462c9cafe8c5faa45bb0b646701aa04c52d856007dc0fb0c009df0f317ee135d7c1ecba72076c3548ff66328119c47be7da83f13576e3b415f93633d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-soundcard \
python310-SoundCard \
python3dist-soundcard"

RDEPENDS:${PN} += "pulseaudio-daemon \
python-abi \
python310-cffi \
python310-numpy"

inherit rpm
