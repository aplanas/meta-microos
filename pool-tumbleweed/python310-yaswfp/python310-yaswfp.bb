SUMMARY = "Yet Another SWF Parser"
DESCRIPTION = "Yet Another SWF Parser."
LICENSE = "GPL-3.0"

PV = "0+git.1411687316.2a2cc6c"

RPM_NAME = "python310-yaswfp-0+git.1411687316.2a2cc6c-1.11.noarch.rpm"
RPM_HASH = "b25e4080c0d9f7bfd16086bfad9f41037823501d8b783ada620ebf68cd562ab2bc61709055a041b79dcec7becba915e9e5fe688ea4462d44e1179f26997f037c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-yaswfp \
python310-yaswfp \
python3dist-yaswfp"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi"

inherit rpm
