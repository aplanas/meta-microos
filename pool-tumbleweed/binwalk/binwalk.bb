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

RPM_NAME = "binwalk-2.3.4-1.1.noarch.rpm"
RPM_HASH = "57e289aea2675f0bd8a8e00b23df4cf3e5550b64ff74f640ec234679349fb25fb078cc2de5309f18776c4d09d0624d3fce972101ad196059a6746ee3db78f882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "binwalk \
python3.10dist-binwalk \
python3dist-binwalk"

RDEPENDS:${PN} += "/usr/bin/python3 \
file \
python-abi \
python3-curses \
ssdeep"

inherit rpm
