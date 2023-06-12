SUMMARY = "RAR Archive Reader for Python"
DESCRIPTION = "This is a Python module for RAR archive reading. It supports both RAR \
2.x and 3.x archives, multi volume archives, Unicode filenames, \
password-protected archives, archive and file comments. The archive \
parsing and non-compressed files are handled in pure Python code, for \
compressed files, the 'unrar' utility is run."
LICENSE = "ISC"

PV = "4.0"

RPM_NAME = "python310-rarfile-4.0-3.5.noarch.rpm"
RPM_HASH = "21b47798b10089c959fa23681ad50994fd1ab15200e5681cf09926e96664e07c15b9c33ea095a6f36f6777728af49e37f1db96feef74c57b06720cde16707a5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rarfile \
python3.10dist(rarfile) \
python310-rarfile \
python3dist(rarfile)"
RDEPENDS:${PN} += "bsdtar \
python(abi)"

inherit rpm
