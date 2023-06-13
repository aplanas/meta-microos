SUMMARY = "Haskell pango library documentation"
DESCRIPTION = "This package provides the Haskell pango library documentation."
LICENSE = "LGPL-2.1-only"

PV = "0.13.8.2"

RPM_NAME = "ghc-pango-doc-0.13.8.2-2.3.noarch.rpm"
RPM_HASH = "f4573e01e36a19a6d1260152be4994e3e41708f4a7834271872480cba9e96c78e1c0e69724d1d92a5cb80daf796b811cd0e3c18fe1c7111f448b686a33954720"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pango-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
