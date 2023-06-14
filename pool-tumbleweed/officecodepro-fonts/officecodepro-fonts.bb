SUMMARY = "A set of OpenType fonts designed for coding environments"
DESCRIPTION = "Office Code Pro is a customized version of Source Code Pro, the monospaced sans serif \
originally created by Paul D. Hunt for Adobe Systems Incorporated. The customizations \
were made specifically for text editors and coding environments, but are still very \
usable in other applications."
LICENSE = "OFL-1.1"

PV = "1.004"

RPM_NAME = "officecodepro-fonts-1.004-1.10.noarch.rpm"
RPM_HASH = "ae18c09bfbb18eff3ddcb68832c3ba50d15d70a0310247fae8836d4fb1220c0cb3640cf6e9f2c2e6029bd491501086414c7b6c9ea0d921001dcfb108caf36497"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "officecodepro-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
