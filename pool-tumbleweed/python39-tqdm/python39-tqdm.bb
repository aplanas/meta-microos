SUMMARY = "An extensible progress meter"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses."
LICENSE = "MIT & MPL-2.0"

PV = "4.65.0"

RPM_NAME = "python39-tqdm-4.65.0-1.1.noarch.rpm"
RPM_HASH = "6390d3e1157708c3de306a558af1069303dfff9b90bb459e1063454a90ab98b34e2c7ad76f5571cc9f00a077e5d8c0b4e4809772e7831bdb27334117ab055bf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tqdm) \
python39-tqdm \
python3dist(tqdm)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
