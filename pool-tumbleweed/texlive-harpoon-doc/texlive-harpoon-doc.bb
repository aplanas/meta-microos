SUMMARY = "Documentation for texlive-harpoon"
DESCRIPTION = "This package includes the documentation for texlive-harpoon"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn21327"

RPM_NAME = "texlive-harpoon-doc-2023.209.1.0svn21327-54.2.noarch.rpm"
RPM_HASH = "4581218c696c476b3cb6fe1357c3e95160ad4b880a85f5ab822ba3e0b04fe0adc8f26fd0cc8eebe415dbdf5adb86ac69b464101faa750ca31e04a40cb459fff7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harpoon-doc"

RDEPENDS:${PN} += ""

inherit rpm
