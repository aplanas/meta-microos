SUMMARY = "An OSP server implementation"
DESCRIPTION = "An OSP server implementation to allow GVM to remotely control OpenVAS."
LICENSE = "AGPL-3.0-or-later"

PV = "22.4.5"

RPM_NAME = "python310-ospd-openvas-22.4.5-1.7.noarch.rpm"
RPM_HASH = "7011d43cd1a2cd793d606383d59248dd30794df47c9da211b4413ee5b4627cdfedb494772aac9719bd4ca3b7cffb369b525ac5b9643d005282c7bd32ed61c6de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ospd-openvas \
python3.10dist-ospd-openvas \
python310-ospd \
python310-ospd-openvas \
python3dist-ospd-openvas"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-defusedxml \
python310-gnupg \
python310-lxml \
python310-packaging \
python310-paho-mqtt \
python310-psutil \
python310-redis"

inherit rpm
