SUMMARY = "Development files for log4cplus"
DESCRIPTION = "This package provides development libraries and headers needed to \
build software making use of log4cplus"
LICENSE = "Apache-2.0"

PV = "2.0.8"

RPM_NAME = "log4cplus-devel-2.0.8-1.5.aarch64.rpm"
RPM_HASH = "9699e2e3b19ef9919baaf75765a6bc1cfd707464ae4e56c40024e70d52be6c373535b8e278e8860ddd7b300593a05ac61913bd7d17659253361a4966d700cbb7"

RPROVIDES:${PN} += "log4cplus-devel \
pkgconfig-log4cplus"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblog4cplus-2-0-3"

inherit rpm
