SUMMARY = "JIS X 0212 (aka JIS 2000) Encodings"
DESCRIPTION = "This module implements encodings that covers JIS X 0213 charset (AKA \
JIS 2000, hence the module name)."
LICENSE = "Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Encode-JIS2K-0.03-1.24.aarch64.rpm"
RPM_HASH = "3481f263ff750a0f82781af048f08952f46fd1ff1f598bf1675cecdddc566d612ad934cdbbdd60be8bf0c348a104ae19c357f1d08bd479c49f6cd360aedac305"

RPROVIDES:${PN} += "perl-Encode--JIS2K \
perl-Encode--JIS2K--2022JP3 \
perl-Encode-JIS2K"

RDEPENDS:${PN} += "/usr/bin/enc2xs \
/usr/bin/sh \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
