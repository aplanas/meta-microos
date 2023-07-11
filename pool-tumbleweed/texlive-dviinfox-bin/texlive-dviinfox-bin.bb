SUMMARY = "Binary files of dviinfox"
DESCRIPTION = "Binary files of dviinfox"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn44515"

RPM_NAME = "texlive-dviinfox-bin-2023.20230311.svn44515-92.1.aarch64.rpm"
RPM_HASH = "4c7b228eb0ace4468d7a0892852afdd79f9011eb2ac069c0b81675d84e755932be627bbadb4f275894e62df28565a53fee6c5b472f9dfb7d60a1949c055e8ff7"

RPROVIDES:${PN} += "texlive-dviinfox-bin"

RDEPENDS:${PN} += "texlive-dviinfox"

inherit rpm
