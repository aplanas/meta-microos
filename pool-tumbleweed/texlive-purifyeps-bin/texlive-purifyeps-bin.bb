SUMMARY = "Binary files of purifyeps"
DESCRIPTION = "Binary files of purifyeps"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-purifyeps-bin-2023.20230311.svn13663-91.1.aarch64.rpm"
RPM_HASH = "298c0882124344bedbac7400c7353885388d71e8ae2f14eacd63848015b206b690789a9b1ad6ea3939ee7f5d1779d8b47fd62ef513e9f8ba0fad2e9833f67520"

RPROVIDES:${PN} += "texlive-purifyeps-bin \
texlive-purifyeps-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-purifyeps"

inherit rpm
