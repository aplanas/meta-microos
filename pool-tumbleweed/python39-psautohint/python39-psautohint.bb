SUMMARY = "Python wrapper for Adobe's PostScript autohinter"
DESCRIPTION = "Python wrapper for Adobe's PostScript autohinter"
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python39-psautohint-2.4.0-1.11.aarch64.rpm"
RPM_HASH = "21007fdf00e0b71cb7e1f026925a35dfa166b2c9ff66062aeb691e288286b99ce480ffe8ab2122a063079236418d56339b67b36ff01356521485f03a27705227"

RPROVIDES:${PN} += "python3.9dist-psautohint \
python39-psautohint \
python3dist-psautohint"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-FontTools \
python39-fs \
update-alternatives"

inherit rpm
