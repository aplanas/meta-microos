SUMMARY = "Natural sorting in Python"
DESCRIPTION = "Natsort provides a function natsorted that helps sort lists \
'naturally' ('naturally' is rather ill-defined, but in general it means \
sorting based on meaning and not computer code point)."
LICENSE = "MIT"

PV = "8.2.0"

RPM_NAME = "python311-natsort-8.2.0-2.3.noarch.rpm"
RPM_HASH = "fd241de4bc625a8936e2b70d15ec4f7754adfaa47a6d7f55a590f756748ebcbb75402f6a4a5e4ca40f1b6c88b1a7becf0dbbdfaebccd32216344110eb925b05a"
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
