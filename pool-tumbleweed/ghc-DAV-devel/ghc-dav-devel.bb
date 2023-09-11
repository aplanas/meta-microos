SUMMARY = "Haskell DAV library development files"
DESCRIPTION = "This package provides the Haskell DAV library development files."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.4"

RPM_NAME = "ghc-DAV-devel-1.3.4-4.12.aarch64.rpm"
RPM_HASH = "11b2da6aea912ada0463ba3c08cfebc091b80f069e63961c6e3c1a0ef8b4f3b81ba20fe7b98b1597aafca6b700c858040377a0374c2ef4ee27a5bceb83bc44ad"

RPROVIDES:${PN} += "ghc-DAV-devel \
ghc-devel-DAV-1.3.4-G1qFskEkpIbLSwcgFe9cbw"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-DAV \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-devel-exceptions-0.10.5 \
ghc-devel-http-client-0.7.14-ElkaPC2YNimBwgzZzglgPe \
ghc-devel-http-client-tls-0.3.6.1-AsHsMYKW0OIKZ6XVfzITj1 \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-lens-5.2.3-77wBUrzlfuWHQNAaqkfvdZ \
ghc-devel-mtl-2.2.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44 \
ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-devel-xml-conduit-1.9.1.3-2cOMN3SNzhLD8DxEiNBrwq \
ghc-devel-xml-hamlet-0.5.0.2-BIJLiWudoZBIDguCKDu3nu"

inherit rpm
