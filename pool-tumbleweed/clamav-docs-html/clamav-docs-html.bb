SUMMARY = "Documentation for ClamAV in HTML format"
DESCRIPTION = "Optional HTML documentation for ClamAV antivirus engine"
LICENSE = "GPL-2.0-only"

PV = "0.103.9"

RPM_NAME = "clamav-docs-html-0.103.9-1.1.noarch.rpm"
RPM_HASH = "0c96a12d66e46064a73ec87f79e01e33070b08b85cfa52423e30dd6a76ca74871539c482e4cdbb34248f71abbd4b18003fba3e05d691b17ae152fa39f3b1ee52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clamav-docs-html"

RDEPENDS:${PN} += "clamav"

inherit rpm
