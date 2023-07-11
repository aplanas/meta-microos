SUMMARY = "An extensible progress meter"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses."
LICENSE = "MIT & MPL-2.0"

PV = "4.65.0"

RPM_NAME = "python311-tqdm-4.65.0-1.3.noarch.rpm"
RPM_HASH = "af81fce5dd8705c0c0023278c60f474fe57b1749d19db21cb8da579bedf15a1810a41d664ce609389bea569d836f412f6be0e5a4e24b65be06c7da41d2a3de6c"
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
