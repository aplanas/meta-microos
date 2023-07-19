SUMMARY = "Binary files of texfot"
DESCRIPTION = "Binary files of texfot"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn33155"

RPM_NAME = "texlive-texfot-bin-2023.20230311.svn33155-93.1.aarch64.rpm"
RPM_HASH = "878ed2e6f36e293d99f85d0d978db659b36213ae13ecd91ee265eba88353211e3fadeaa5db2ec988ee18dfa51663cc5ebd364fc2a03c44b34d27818f41e59df5"

RPROVIDES:${PN} += "texlive-texfot-bin"

RDEPENDS:${PN} += "texlive-texfot"

inherit rpm
