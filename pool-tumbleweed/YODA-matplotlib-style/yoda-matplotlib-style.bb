SUMMARY = "Matplotlib style file for YODA styled plots"
DESCRIPTION = "This package provides a style file that may be used with matplotlib to produce \
YODA styled plots."
LICENSE = "GPL-2.0-only"

PV = "1.9.8"

RPM_NAME = "YODA-matplotlib-style-1.9.8-1.1.noarch.rpm"
RPM_HASH = "1457036518f00339783f1f5fea427e31886f1504ae2b5128a1fc34091bf07bead73d174a46dabe180516bb22e767d6244acf1d0db97bb15bb366dcf211d2e1cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "YODA-matplotlib-style"

RDEPENDS:${PN} += "python3-matplotlib"

inherit rpm
