SUMMARY = "Documentation for gdouros-abydos-fonts"
DESCRIPTION = "Contains pdf documentation for gdouros-abydos-fonts."
LICENSE = "SUSE-Permissive"

PV = "1.96"

RPM_NAME = "gdouros-abydos-fonts-doc-1.96-2.7.noarch.rpm"
RPM_HASH = "34ffa882de3c52dd9c0acab8255ade9ac4592caf769a3fa02089bed39bae822cc062b015e2b17b080b43bab7a152fa4f3a8e6b2f95dd9d1e652d77fef9da52e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdouros-abydos-fonts-doc"

RDEPENDS:${PN} += "gdouros-abydos-fonts"

inherit rpm
