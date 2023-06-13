SUMMARY = "Program to pipe streams from services into a video player"
DESCRIPTION = "Streamlink is a command-line utility which pipes video streams from various \
services into a video player, such as VLC. The main purpose of Streamlink is to \
avoid resource-heavy and unoptimized websites, while still allowing the user to \
enjoy various streamed content."
LICENSE = "BSD-2-Clause"

PV = "5.3.1"

RPM_NAME = "streamlink-5.3.1-1.1.noarch.rpm"
RPM_HASH = "e1a6ed8833dfe40e709c9ab9f7400f2426636504aa4d452e87ba855c2f1d04d49608dcaffb728dcc717c4a2267555f03abfc68caace6b4cfe9b0bbfc2155aaea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(streamlink) \
python3dist(streamlink) \
streamlink"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python(abi) \
python3-PySocks \
python3-certifi \
python3-isodate \
python3-lxml \
python3-pycountry \
python3-pycryptodome \
python3-requests \
python3-urllib3 \
python3-websocket-client"

inherit rpm
