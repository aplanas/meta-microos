SUMMARY = "An extensible progress meter"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses."
LICENSE = "MIT & MPL-2.0"

PV = "4.66.1"

RPM_NAME = "python310-tqdm-4.66.1-1.1.noarch.rpm"
RPM_HASH = "c5f41479995a699348c62c85e71be91df3bb3f5a8c85bf5a0135169eb319c7aa1486d7241be7c87bc1e41d60e6d32f4639b735a7689764e9b2b3537dcc546ce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tqdm \
python310-tqdm \
python3dist-tqdm"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
