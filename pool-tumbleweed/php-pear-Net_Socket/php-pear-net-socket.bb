SUMMARY = "Network Socket Interface"
DESCRIPTION = "Net_Socket is a class interface to TCP sockets. It provides blocking \
and non-blocking operation, with different reading and writing modes \
(byte-wise, block-wise, line-wise and special formats like network \
byte-order ip addresses)."
LICENSE = "BSD-2-Clause"

PV = "1.2.2"

RPM_NAME = "php-pear-Net_Socket-1.2.2-1.10.noarch.rpm"
RPM_HASH = "4b26e8c2b11ee2b3bad60c7becb7e9b06963d35124f2f000e6d01e117c09d0bb22d383d5005fa0bd02ed91e2195bd78febb5ea87885ef96df9998965932fbadc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear-Net-Socket \
php5-pear-Net-Socket \
php7-pear-Net-Socket"

RDEPENDS:${PN} += "/bin/sh \
php-pear"

inherit rpm
