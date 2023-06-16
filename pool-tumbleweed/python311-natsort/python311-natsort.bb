SUMMARY = "Natural sorting in Python"
DESCRIPTION = "Natsort provides a function natsorted that helps sort lists \
'naturally' ('naturally' is rather ill-defined, but in general it means \
sorting based on meaning and not computer code point)."
LICENSE = "MIT"

PV = "8.2.0"

RPM_NAME = "python311-natsort-8.2.0-1.4.noarch.rpm"
RPM_HASH = "83b123bae42910fd8df5be596e7bb8a76de2e18b7dcf2bb1489fb60e379787d4b3d6e5441fef50b7823621ec801ad7c65bbca5bec617867ee800fed889899326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-natsort \
python311-natsort \
python3dist-natsort"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
