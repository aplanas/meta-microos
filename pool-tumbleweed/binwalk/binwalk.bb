SUMMARY = "Firmware Analysis Tool"
DESCRIPTION = "Binwalk is a tool for searching a given binary image for embedded \
files and executable code. Specifically, it is designed for \
identifying files and code embedded inside of firmware images. \
Binwalk uses the libmagic library, so it is compatible with magic \
signatures created for the Unix file utility. Binwalk also includes \
a custom magic signature file which contains improved signatures \
for files that are commonly found in firmware images such as \
compressed/archived files, firmware headers, Linux kernels, \
bootloaders, filesystems, etc."
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "binwalk-2.3.4-1.2.noarch.rpm"
RPM_HASH = "76d2fdefa8d2ef50d844be678235f6c19b40c8e046a30fc60d09e3c2f20cb24b061545aa17aa9828c71d99b83fadf38dfd87138ffabd7820783011f00b34eb30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "binwalk \
python3.11dist-binwalk \
python3dist-binwalk"

RDEPENDS:${PN} += "/usr/bin/python3 \
file \
python-abi \
python3-curses \
ssdeep"

inherit rpm
