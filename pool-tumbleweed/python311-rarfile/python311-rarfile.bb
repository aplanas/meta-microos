SUMMARY = "RAR Archive Reader for Python"
DESCRIPTION = "This is a Python module for RAR archive reading. It supports both RAR \
2.x and 3.x archives, multi volume archives, Unicode filenames, \
password-protected archives, archive and file comments. The archive \
parsing and non-compressed files are handled in pure Python code, for \
compressed files, the 'unrar' utility is run."
LICENSE = "ISC"

PV = "4.0"

RPM_NAME = "python311-rarfile-4.0-3.7.noarch.rpm"
RPM_HASH = "ab8798a267648ca7ca31600670b053b86baa6dd8e49761ddfbe621eca5185e64139ee38bc03763c48e65d0b4d5cadea2dec3175164f22008a7f7131e6859eb9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rarfile \
python3.11dist-rarfile \
python311-rarfile \
python3dist-rarfile"

RDEPENDS:${PN} += "bsdtar \
python-abi"

inherit rpm
