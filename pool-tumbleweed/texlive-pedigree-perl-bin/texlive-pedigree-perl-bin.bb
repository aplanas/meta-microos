SUMMARY = "Binary files of pedigree-perl"
DESCRIPTION = "Binary files of pedigree-perl"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25962"

RPM_NAME = "texlive-pedigree-perl-bin-2023.20230311.svn25962-93.2.aarch64.rpm"
RPM_HASH = "641ab96dc9455eaf3ac55d911891b066d8eca172eb30d85eba12ad81ad8e1412020c44551510d449f96e06b7ca5078f1e67cd3e9ef735a5314730dfbf3435b33"

RPROVIDES:${PN} += "texlive-pedigree-perl-bin"

RDEPENDS:${PN} += "texlive-pedigree-perl"

inherit rpm
