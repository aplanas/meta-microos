SUMMARY = "Python module for ANSI color output and colored highlighting and diffing"
DESCRIPTION = "Ansicolor is a library that offers ANSI color markup for \
command line programs."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "python311-ansicolor-0.3.2-1.7.noarch.rpm"
RPM_HASH = "6792851ec26d1a023f8d879ea922fd17aaf5944f497656f99220aeaefb0aa092c215102ba7056504b6c4dcb62a7b372f11a71247e4cc687e3141f1614140e506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansicolor \
python3.11dist-ansicolor \
python311-ansicolor \
python3dist-ansicolor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
