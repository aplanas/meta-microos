SUMMARY = "An extensible progress meter"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses."
LICENSE = "MIT & MPL-2.0"

PV = "4.65.0"

RPM_NAME = "python310-tqdm-4.65.0-1.3.noarch.rpm"
RPM_HASH = "ed0ec5967fa43a5a42ceb29121e203dfd406aa10b2c20e45cc6e5c3e97209a2998ad10a37a524463c97863136e4ca2c630126ac22d5667645f2ec9b6cf2025e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tqdm \
python310-tqdm \
python3dist-tqdm"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
