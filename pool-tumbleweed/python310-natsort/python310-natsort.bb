SUMMARY = "Natural sorting in Python"
DESCRIPTION = "Natsort provides a function natsorted that helps sort lists \
'naturally' ('naturally' is rather ill-defined, but in general it means \
sorting based on meaning and not computer code point)."
LICENSE = "MIT"

PV = "8.2.0"

RPM_NAME = "python310-natsort-8.2.0-2.3.noarch.rpm"
RPM_HASH = "76cb501b1908f035356fdb2ad541d8e3b689a1443bda9748210bfff2f174bd215758a2f9ed6611109739cb3d80045f726285c3df056c27eaf64d0954e5150902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-natsort \
python310-natsort \
python3dist-natsort"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
