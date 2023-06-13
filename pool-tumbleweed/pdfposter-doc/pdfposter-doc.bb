SUMMARY = "Documentation files for pdfposter"
DESCRIPTION = "HTML Documentation and examples for pdfposter."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.1"

RPM_NAME = "pdfposter-doc-0.8.1-1.1.noarch.rpm"
RPM_HASH = "0f5db28c572e37f65265afc218ca73f11c54918593a0e36ad312b3163acef1c2017b3db1fda8f0bb77d1b04bc2fe2fcfeb487fcf6db6fddc73db6082abe05e22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdfposter-doc"

RDEPENDS:${PN} += ""

inherit rpm
