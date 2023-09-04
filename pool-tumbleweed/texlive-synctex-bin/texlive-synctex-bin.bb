SUMMARY = "Binary files of synctex"
DESCRIPTION = "Binary files of synctex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-synctex-bin-2023.20230311.svn66084-93.2.aarch64.rpm"
RPM_HASH = "2843b5fd4f310ae39e5557ecac9ba1105fbc8ac2325b2a47196d73f680eb6e975bdd614a48f08fe290fbc7b49058965878f761b5d3b43a00bcb1c98187ec7069"

RPROVIDES:${PN} += "texlive-synctex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsynctex.so.2 \
texlive-synctex"

inherit rpm
