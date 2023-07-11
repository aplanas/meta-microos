SUMMARY = "An extensible progress meter"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses."
LICENSE = "MIT & MPL-2.0"

PV = "4.65.0"

RPM_NAME = "python39-tqdm-4.65.0-1.3.noarch.rpm"
RPM_HASH = "d76fe22d63051647ea3d60481f4e1d1a292075e4e0bf8e5182f007e3fd410afc5876a5272948320d9e5018630bf320e54d1a60fe0e438fbc02a46b07b3c9f508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tqdm \
python39-tqdm \
python3dist-tqdm"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
