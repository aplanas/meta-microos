SUMMARY = "An extensible progress meter"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses."
LICENSE = "MIT & MPL-2.0"

PV = "4.66.1"

RPM_NAME = "python310-tqdm-4.66.1-2.1.noarch.rpm"
RPM_HASH = "50456adbf017fb8db555b285540d3e0418160a26749fe670e432003e737cd99801de4542feedffd9512cc361fa4540e847bc198b6107c94fa5341f79f97cf81d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tqdm \
python310-tqdm \
python3dist-tqdm"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
