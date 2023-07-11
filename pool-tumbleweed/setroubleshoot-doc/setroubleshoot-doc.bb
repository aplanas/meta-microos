SUMMARY = "Setroubleshoot documentation"
DESCRIPTION = "Setroubleshoot documentation package"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.30"

RPM_NAME = "setroubleshoot-doc-3.3.30-2.3.noarch.rpm"
RPM_HASH = "5aed3f33c0a5638ec2397c59fa1fc946d1f08f2989de331d37c15fea95fa00e3b04acbc37069d6fceac9282fd60427537a73f2dd827310009f87903e3a7bcb2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "setroubleshoot-doc"

RDEPENDS:${PN} += "setroubleshoot"

inherit rpm
