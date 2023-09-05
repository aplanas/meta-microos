SUMMARY = "An extensible progress meter"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses."
LICENSE = "MIT & MPL-2.0"

PV = "4.66.1"

RPM_NAME = "python39-tqdm-4.66.1-2.1.noarch.rpm"
RPM_HASH = "26a661a98f2e1aae9826650ca9e0a6ba1540b90e6b01bb4e95fec3c2bda1bb4f98c794dfccc29218963b066f3a6500529e8c4f49df4d1de79d195eace07890cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tqdm \
python39-tqdm \
python3dist-tqdm"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
