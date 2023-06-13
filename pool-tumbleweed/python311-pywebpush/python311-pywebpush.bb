SUMMARY = "WebPush publication library"
DESCRIPTION = "WebPush publication library."
LICENSE = "MPL-2.0"

PV = "1.14.0"

RPM_NAME = "python311-pywebpush-1.14.0-2.6.noarch.rpm"
RPM_HASH = "e80890d0794aced73fbf91ac884b7e48b5c3fd2d017f7070748358edd6b996aa530ff59aa12bc37c1b8f303c2b9b1e388d6bacf0e0bb4298ea7aa8e1c7315892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pywebpush) \
python311-pywebpush \
python3dist(pywebpush)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-cryptography \
python311-http-ece \
python311-py-vapid \
python311-requests \
update-alternatives"

inherit rpm
