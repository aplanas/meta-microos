SUMMARY = "Dumb downloader that scrapes the web"
DESCRIPTION = "You-Get is a command-line utility to download media contents \
(videos, audios, images) from the Web, in case there is no other \
handy way to do it."
LICENSE = "MIT"

PV = "0.4.1650"

RPM_NAME = "you-get-0.4.1650-1.4.noarch.rpm"
RPM_HASH = "1ad497ac90575ad5091362ded25fac8e81ca8717725252ead643bac000848eaa45335da7274862d652ed6a3d69e9099a160c0c672bcff2e78adc91d28bb92b61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-you-get \
python3dist-you-get \
you-get"

RDEPENDS:${PN} += "/usr/bin/python3 \
ffmpeg \
python-abi"

inherit rpm
