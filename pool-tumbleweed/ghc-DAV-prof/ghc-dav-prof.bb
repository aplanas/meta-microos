SUMMARY = "Haskell DAV profiling library"
DESCRIPTION = "This package provides the Haskell DAV profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.4"

RPM_NAME = "ghc-DAV-prof-1.3.4-4.12.aarch64.rpm"
RPM_HASH = "fcc9c2c17aa33421aa7b286b09249b46bdedb5e078517b7442271a2c898db24bb4c0da24403a8f1123132917604b7532c361b58da496e374d9cde259027578c7"

RPROVIDES:${PN} += "ghc-DAV-prof \
ghc-prof-DAV-1.3.4-G1qFskEkpIbLSwcgFe9cbw"

RDEPENDS:${PN} += "ghc-DAV-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-prof-exceptions-0.10.5 \
ghc-prof-http-client-0.7.14-ElkaPC2YNimBwgzZzglgPe \
ghc-prof-http-client-tls-0.3.6.1-AsHsMYKW0OIKZ6XVfzITj1 \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-lens-5.2.3-77wBUrzlfuWHQNAaqkfvdZ \
ghc-prof-mtl-2.2.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44 \
ghc-prof-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-prof-xml-conduit-1.9.1.3-2cOMN3SNzhLD8DxEiNBrwq \
ghc-prof-xml-hamlet-0.5.0.2-BIJLiWudoZBIDguCKDu3nu"

inherit rpm
