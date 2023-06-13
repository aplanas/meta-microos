SUMMARY = "League Of Movable Type's 'League Script Number One' font"
DESCRIPTION = "Script #1 is a modern, coquettish script font that intends to look \
like handwritten letters from the 1920s. It includes ligatures \
included."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-script1-fonts-0.20121218-8.7.noarch.rpm"
RPM_HASH = "265299aca71b1f49c4244f21ea73a259f900c30377569f72f7c977d15f2652cb9bae06b548d55818f231db90a1624e6dba70ffc48cb2097a198c8b574ff30ec4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-script1-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
