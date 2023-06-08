SUMMARY = "Bitstream Vera(tm) Truetype fonts"
DESCRIPTION = "The package contains the 'Vera' truetype fonts from Bitstream Inc."
LICENSE = "Bitstream-Vera"

PV = "1.10"

RPM_NAME = "bitstream-vera-fonts-1.10-316.2.noarch.rpm"
RPM_HASH = "4b335d58c7e9980d60b5ba6b4ca394e00de4f06247322e98f6055b50f497de7023df0450223b5345c80aa1a11d025a70006cd6bc29d3f78c983b5a8f9d89e866"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bitstream-vera bitstream-vera-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
