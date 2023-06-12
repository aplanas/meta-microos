SUMMARY = "An extensible progress meter"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses."
LICENSE = "MIT & MPL-2.0"

PV = "4.65.0"

RPM_NAME = "python310-tqdm-4.65.0-1.1.noarch.rpm"
RPM_HASH = "fa81bdc0b42a3297ee08c4327e7a632f84d1609495c3d30e7128af0734b0b4889e540d8716a47435435167c6309505ab726b77e3f97f9b07b9babf165b1bb7d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tqdm \
python3.10dist(tqdm) \
python310-tqdm \
python3dist(tqdm)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
