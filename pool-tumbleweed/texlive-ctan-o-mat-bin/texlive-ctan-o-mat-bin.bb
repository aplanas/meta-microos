SUMMARY = "Binary files of ctan-o-mat"
DESCRIPTION = "Binary files of ctan-o-mat"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn46996"

RPM_NAME = "texlive-ctan-o-mat-bin-2023.20230311.svn46996-93.2.aarch64.rpm"
RPM_HASH = "b1323eb01f4950de86f0ebe577f264a68657d46fed9ba99a9f2a34dc0fcd3bedf40c1697805540c94929237311a3dfe011adba3969f0b87c57ce602a355a6c96"

RPROVIDES:${PN} += "texlive-ctan-o-mat-bin"

RDEPENDS:${PN} += "texlive-ctan-o-mat"

inherit rpm
