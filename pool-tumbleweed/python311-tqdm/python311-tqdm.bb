SUMMARY = "An extensible progress meter"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses."
LICENSE = "MIT & MPL-2.0"

PV = "4.66.1"

RPM_NAME = "python311-tqdm-4.66.1-2.1.noarch.rpm"
RPM_HASH = "789d0c6687f15aa07b8712e57855f55ee2d65caac52e6dde3bfbcf363e8c72089b07369de46044ab47fe36b949c923356849b1ab5041cc30fa06fa51f27491eb"
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
