SUMMARY = "Colorize commands output or STDIN using patterns"
DESCRIPTION = "Easily colorize logs or commands output using patterns."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "rainbow-2.8.0-1.4.noarch.rpm"
RPM_HASH = "db0a5430f3eadd826d13a1af56d4e4d742e1d6efd4eb0d21624f2c5e6ea6ca41681dbbcfb84abb6f71af8cac322548f278bd5872c60eb2011b45296ea9b04a49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(rainbow) \
python3dist(rainbow) \
rainbow"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi)"

inherit rpm
