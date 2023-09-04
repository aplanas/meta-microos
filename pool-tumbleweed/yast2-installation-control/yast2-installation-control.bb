SUMMARY = "YaST2 - RNG schema for installation control files"
DESCRIPTION = "This package contains RNG schema for validating the installation control files."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-installation-control-4.6.1-1.1.noarch.rpm"
RPM_HASH = "03082235ca2ced250e3b6d4845c2f41ad8f0111e55e6162537cfe6d0d61b7d8054f0eb94bdc64df4112fec28c3c9417c804b20904f113ddda7f5e6a40158e6f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro-skelcd-control-datadir \
yast2-installation-control"

RDEPENDS:${PN} += ""

inherit rpm
