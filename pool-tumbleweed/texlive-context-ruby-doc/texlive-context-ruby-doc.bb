SUMMARY = "Documentation for texlive-context-ruby"
DESCRIPTION = "This package includes the documentation for texlive-context-ruby"
LICENSE = "SUSE-Public-Domain"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-ruby-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "56791e143b7b52d8a72cfae716499fe7c6804a53725e2ae30bf92ed00e16ffa2f0c9f8485628d28ceeb601c8967c6644d8a9a15e4f45e7a905537310882ed216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-ruby-doc"

RDEPENDS:${PN} += ""

inherit rpm
