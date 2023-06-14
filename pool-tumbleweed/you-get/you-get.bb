SUMMARY = "Dumb downloader that scrapes the web"
DESCRIPTION = "You-Get is a command-line utility to download media contents \
(videos, audios, images) from the Web, in case there is no other \
handy way to do it."
LICENSE = "MIT"

PV = "0.4.1650"

RPM_NAME = "you-get-0.4.1650-1.3.noarch.rpm"
RPM_HASH = "1a40e4eaa0f54b30722870cc8216e40e5cbb3aa9de142286210ec4bf2900b903a6bca2cef08b33e3bc3cd169a30a7e3cc842df00b884fe7e5278cb6b6cb9538d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-you-get \
python3dist-you-get \
you-get"

RDEPENDS:${PN} += "/usr/bin/python3 \
ffmpeg \
python-abi"

inherit rpm
