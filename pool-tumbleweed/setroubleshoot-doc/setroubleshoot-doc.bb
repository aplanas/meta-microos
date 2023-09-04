SUMMARY = "Setroubleshoot documentation"
DESCRIPTION = "Setroubleshoot documentation package"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.31"

RPM_NAME = "setroubleshoot-doc-3.3.31-1.1.noarch.rpm"
RPM_HASH = "34fc29b84b0b513c2afa5916adddeec7e576489ad37b295e729fd08b70dd2709798753b53cdbc3cfa221dc3f2c5418e717f90ada2bc7d8e8dc026fbb806f2e68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "setroubleshoot-doc"

RDEPENDS:${PN} += "setroubleshoot"

inherit rpm
