SUMMARY = "Extract Data From Macintosh Binhex Files"
DESCRIPTION = "*BinHex* is a format used by Macintosh for transporting Mac files safely \
through electronic mail, as short-lined, 7-bit, semi-compressed data \
streams. Ths module provides a means of converting those data streams back \
into into binary data."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.125"

RPM_NAME = "perl-Convert-BinHex-1.125-1.26.noarch.rpm"
RPM_HASH = "beaa65ca63b0f6132b5e7a2c189c5067e3967c6d5b3795e79855825d03903e4ccf057c5fc322695c1cdc50b33f587dee53ffa725affa3f047451faa18b840dbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Convert--BinHex \
perl-Convert--BinHex--Bin2Hex \
perl-Convert--BinHex--Fork \
perl-Convert--BinHex--Hex2Bin \
perl-Convert--BinHex--IO-Handle \
perl-Convert--BinHex--IO-Scalar \
perl-Convert-BinHex"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
