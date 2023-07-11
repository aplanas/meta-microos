SUMMARY = "RAR Archive Reader for Python"
DESCRIPTION = "This is a Python module for RAR archive reading. It supports both RAR \
2.x and 3.x archives, multi volume archives, Unicode filenames, \
password-protected archives, archive and file comments. The archive \
parsing and non-compressed files are handled in pure Python code, for \
compressed files, the 'unrar' utility is run."
LICENSE = "ISC"

PV = "4.0"

RPM_NAME = "python39-rarfile-4.0-3.7.noarch.rpm"
RPM_HASH = "7ba2981497d7733dba03d006a4d99d7ec2c12175bab68d8d47d3fb1f086b562efd44f17f5df3616b63f1589e21ab4c64cb5c4506756481ede63bffc8009c3205"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rarfile \
python39-rarfile \
python3dist-rarfile"

RDEPENDS:${PN} += "bsdtar \
python-abi"

inherit rpm
