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

RPM_NAME = "python39-SoundCard-0.4.2-1.5.noarch.rpm"
RPM_HASH = "3f26323262ad638a2fd381d7318c9368f69f4c0e2ffb48693276085cec2a6349efe9017d67210a48a3296f5ad9ed57f8357e46176abccf00003300c5887b20eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-soundcard \
python39-SoundCard \
python3dist-soundcard"

RDEPENDS:${PN} += "pulseaudio-daemon \
python-abi \
python39-cffi \
python39-numpy"

inherit rpm
