SUMMARY = "The Mycroft Artificial Intelligence platform"
DESCRIPTION = "Mycroft is a voice assistant."
LICENSE = "GPL-3.0-only"

PV = "18.8.13"

RPM_NAME = "mycroft-core-18.8.13-1.15.noarch.rpm"
RPM_HASH = "bc209549da1cf73d177748d79fe450c3aead6a20ab5d3007bd773e05ec633a6e8f0876254ea82341d24ba71c989e4d0aa31a36d0d046af11f9072b8f91d9d15e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-mycroft-core \
mycroft-core \
python3.10dist-mycroft-core \
python3dist-mycroft-core"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
curl \
git \
jq \
mimic \
mpg123 \
mpg123-pulse \
openssl \
patch \
portaudio \
python-abi \
python3-Pillow \
python3-PyAutoGUI \
python3-PyChromecast \
python3-PyRIC \
python3-PyYAML \
python3-SpeechRecognition \
python3-adapt-parser \
python3-arrow \
python3-astral \
python3-dbus-python \
python3-ddg3 \
python3-fann2 \
python3-fasteners \
python3-feedparser \
python3-gTTS \
python3-gTTS-token \
python3-gobject \
python3-google-api-python-client \
python3-humanhash3 \
python3-ifaddr \
python3-inflection \
python3-monotonic \
python3-msk \
python3-msm \
python3-multi-key-dict \
python3-netifaces \
python3-num2words \
python3-padaos \
python3-padatious \
python3-parsedatetime \
python3-petact \
python3-pip \
python3-pocketsphinx-python \
python3-precise-runner \
python3-psutil \
python3-pulsectl \
python3-pyalsaaudio \
python3-pycodestyle \
python3-pyee \
python3-pyjokes \
python3-pyowm \
python3-pyserial \
python3-python-aiml \
python3-python-dateutil \
python3-python-vlc \
python3-python-xlib \
python3-pytz \
python3-requests \
python3-requests-futures \
python3-setuptools \
python3-six \
python3-tornado \
python3-tzlocal \
python3-virtualenv \
python3-virtualenvwrapper \
python3-websocket-client \
python3-wikipedia \
python3-wolframalpha \
screen \
systemd"

inherit rpm
