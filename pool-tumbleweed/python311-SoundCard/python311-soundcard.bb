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

RPM_NAME = "python311-SoundCard-0.4.2-1.5.noarch.rpm"
RPM_HASH = "1f9a134f8eea822825da6903748feb94eaea75416a1b566ceb847553ce087a43f68fb71226c6d6527d153c8cb4182df53084352ee525413c6c6b7de977a81fb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-SoundCard \
python3.11dist-soundcard \
python311-SoundCard \
python3dist-soundcard"

RDEPENDS:${PN} += "pulseaudio-daemon \
python-abi \
python311-cffi \
python311-numpy"

inherit rpm
