SUMMARY = "An extensible progress meter"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses."
LICENSE = "MIT & MPL-2.0"

PV = "4.66.1"

RPM_NAME = "python39-tqdm-4.66.1-1.1.noarch.rpm"
RPM_HASH = "d016e852b365a300981443a7b322b0f66bda696962b1eed486a94533e29f65226ba7fd4bdb5eb147c7ef58143426c6efb603d900e7071f3496f2e69b31bd5cf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tqdm \
python39-tqdm \
python3dist-tqdm"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
