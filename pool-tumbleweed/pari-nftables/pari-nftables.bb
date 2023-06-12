SUMMARY = "Megrez Number Field tables for the PARI CAS"
DESCRIPTION = "This package contains the historical megrez number field tables \
(errors fixed, 1/10th the size, easier to use) for the PARI CAS."
LICENSE = "GPL-2.0-or-later"

PV = "20080929"

RPM_NAME = "pari-nftables-20080929-9.3.noarch.rpm"
RPM_HASH = "d9acdb8a7c9fd537e8c721e07b47e9c42e678e10b61522088557fc4f5da37296d05eb54fabbfa5023adb66b375180894455427e0d665d0362ce8864dc36ec090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pari-nftables"
RDEPENDS:${PN} += ""

inherit rpm
