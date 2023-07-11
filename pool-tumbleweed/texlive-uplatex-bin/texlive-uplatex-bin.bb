SUMMARY = "Binary files of uplatex"
DESCRIPTION = "Binary files of uplatex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52800"

RPM_NAME = "texlive-uplatex-bin-2023.20230311.svn52800-92.1.aarch64.rpm"
RPM_HASH = "b26a23ffa35ad89c457ece9cd313a59c49af1206b84ed7ae5f151a44f83ca8a068a1a092232e692b24fe66a7bb1965a3da76c9b2843040eb476c0b575abe0d7e"

RPROVIDES:${PN} += "texlive-uplatex-bin"

RDEPENDS:${PN} += "texlive-uplatex"

inherit rpm
