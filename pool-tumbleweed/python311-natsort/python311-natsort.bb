SUMMARY = "Natural sorting in Python"
DESCRIPTION = "Natsort provides a function natsorted that helps sort lists \
'naturally' ('naturally' is rather ill-defined, but in general it means \
sorting based on meaning and not computer code point)."
LICENSE = "MIT"

PV = "8.4.0"

RPM_NAME = "python311-natsort-8.4.0-1.1.noarch.rpm"
RPM_HASH = "56470a48caecb007056255c3bd5d1ebfa7d6982057f5d4446750486e39a2244caac84af29ed918a684c545879b2d6a6070f5f81162da773de50ff799e548b0e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-natsort \
python3.11dist-natsort \
python311-natsort \
python3dist-natsort"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
