SUMMARY = "Documentation for texlive-context-ruby"
DESCRIPTION = "This package includes the documentation for texlive-context-ruby"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-ruby-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "83f626320f3be0958a7c630ed6be42ebb98f351c228ea876bc068d7ff1dc9961fbaa8faa1227069e376c8cb841b1f79cd01b138142fa1a27435b5b1e9e3e34b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-ruby-doc"

RDEPENDS:${PN} += ""

inherit rpm
