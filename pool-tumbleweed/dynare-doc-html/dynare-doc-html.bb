SUMMARY = "Documentation for dynare in HTML format"
DESCRIPTION = "This package provides documentation for dynare in HTML format."
LICENSE = "GPL-3.0-or-later"

PV = "5.4"

RPM_NAME = "dynare-doc-html-5.4-1.1.noarch.rpm"
RPM_HASH = "cc5b741a6eb574cb845e3f33b972f74c71008fb818a05bf118df8f7fec1abd6c6eb75c4f8e48723663d4e922b41a9e91c942cc17c79948a6bb8b12a320cfaa3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dynare-doc-html"
RDEPENDS:${PN} += ""

inherit rpm
