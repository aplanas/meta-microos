SUMMARY = "Extract Data From Macintosh Binhex Files"
DESCRIPTION = "*BinHex* is a format used by Macintosh for transporting Mac files safely \
through electronic mail, as short-lined, 7-bit, semi-compressed data \
streams. Ths module provides a means of converting those data streams back \
into into binary data."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.125"

RPM_NAME = "perl-Convert-BinHex-1.125-1.27.noarch.rpm"
RPM_HASH = "5a3562b5be5096c2116ed0c6e59b6c095e4307e713f37663b4873201043335cf33d909d6857ea362654165887ed02ee7bf27a0e39ac5e672e4b5d7d02bee3c62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Convert--BinHex \
perl-Convert--BinHex--Bin2Hex \
perl-Convert--BinHex--Fork \
perl-Convert--BinHex--Hex2Bin \
perl-Convert--BinHex--IO-Handle \
perl-Convert--BinHex--IO-Scalar \
perl-Convert-BinHex"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
