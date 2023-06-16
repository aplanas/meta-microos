SUMMARY = "Little Korean <-> English Dictionary"
DESCRIPTION = "Little Korean <-> English dictionary."
LICENSE = "SUSE-Public-Domain"

PV = "0.2"

RPM_NAME = "engdic-0.2-144.17.noarch.rpm"
RPM_HASH = "0c2cd81db009ff6d309a96710e5e6295927e77b5b918a0031b75b0de5f576713165dac6bf49a315b8e344ac69a837209247844b2af4092978f12e43ca59042aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "engdic"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
