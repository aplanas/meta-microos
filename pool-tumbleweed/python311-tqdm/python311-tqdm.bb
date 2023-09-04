SUMMARY = "An extensible progress meter"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses."
LICENSE = "MIT & MPL-2.0"

PV = "4.66.1"

RPM_NAME = "python311-tqdm-4.66.1-1.1.noarch.rpm"
RPM_HASH = "07bd42ab086152b75c4acbea17ec6a068e5c21d2d81cc9be9a7be78961d3655c1f63609e2c84b84551521dfd1a7422daebe637f312ada3b9698b0c716246658d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tqdm \
python3.11dist-tqdm \
python311-tqdm \
python3dist-tqdm"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
